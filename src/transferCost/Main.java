package transferCost;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/10.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] road = new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==j)
                {
                    road[i][j] = 0;
                }
                else
                    road[i][j] = 2048;
            }
        }
        for(int i=1;i<n;i++)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            road[a][b] = c;
            road[b][a] = c;
        }
       /* for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(road[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();*/

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (road[i][j] > road[i][k] + road[k][j])
                        road[i][j] = road[i][k] + road[k][j];
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (road[i][j] > max)
                    max = road[i][j];
            }
        }
        //System.out.println(max);
        System.out.println(getNum(max));

    }
    public static int getNum(int n)
    {
        int init = 11;
        if(n>=2)
        {
            for(int i=2;i<=n;i++)
            {
                init = init + i + 10;
            }
        }
        return init;
    }
}
