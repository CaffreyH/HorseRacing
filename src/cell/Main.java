package cell;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/13.
 */
public class Main   {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] num = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            num[i] = scanner.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            int game = scanner.nextInt();
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            System.out.println(game+ " "+from+" "+to);
            int result = 0;
            if(game == 1)
            {
                System.out.println();
            }
            else if(game == 2)
            {
                for(int j=from;j<=to;j++)
                {
                    result = result + num[j];
                }
                System.out.println(result);
            }
            else if(i== 3)
            {
                for(int j=from;j<=to;j++)
                {
                    if(num[j]>result)
                    {
                        result = num[j];
                    }
                }
                System.out.println(result);
            }
            else
            {
                System.out.println();
            }
        }

    }

}
