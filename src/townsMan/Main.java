package townsMan;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/13.
 */
public class Main {
    static int[][] relation;
    static int n;
    static int m;
    static int result = 0;
    static HashMap<Integer,Integer> laoxiang = new HashMap<>();
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            n = scanner.nextInt();
            m = scanner.nextInt();
            if(m==0 && n==0)
            {
                break;
            }
            relation = new int[n+1][n+1];
            for(int i=0;i<m;i++)
            {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                relation[a][b] = 1;
                relation[b][a] = 1;
            }
            getR(1);
            System.out.println(laoxiang.size());
            laoxiang.clear();
        }
    }

    private static void getR(int i) {
        for(int j=2;j<=n;j++)
        {
            if(relation[i][j]==1)
            {
                if(!laoxiang.containsKey(j) )
                {
                    //System.out.print(j+" "+laoxiang.containsKey(j));
                    laoxiang.put(j,1);
                    getR(j);
                }
                else
                {
                    //System.out.println("有了");
                }
            }
        }
    }
}
