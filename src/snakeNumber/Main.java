package snakeNumber;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/14.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] num = new int[n][n];
        int count = 1;
        int ceng = 0;
        int yb = 0;int yl = n-1;
        int xb = 0;int xl = n-1;
        int zb = 0;int zl = n-1;
        int sb = 0;int sl = n-1;
        if(n%2==0)
        {
            ceng = n /2 ;
        }
        else
        {
            ceng = n /2 +1;
        }
        for(int a = 0;a<ceng;a++)
        {
            for(int i=yb;i<=yl;i++)
            {
                if(num[i][n-1-a]==0)
                num[i][n-1-a] = count++;
            }
            yb++;
            yl--;
            for(int i=xl;i>=xb;i--)
            {
                if(num[n-1-a][i]==0)
                num[n-1-a][i] = count++;
            }
            xb++;
            xl--;
            for(int i=zl;i>=zb;i--)
            {
                if(num[i][a]==0)
                num[i][a] = count++;
            }
            zb++;
            zl--;
            for(int i=sb;i<=sl;i++)
            {
                if(num[a][i]==0)
                num[a][i] = count++;
            }

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }

}
