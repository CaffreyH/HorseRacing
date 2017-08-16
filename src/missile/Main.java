package missile;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/10.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int geshu = 0;
        int height = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int num = scanner.nextInt();
            int[] missile = new int[num];
            for(int j=0;j<num;j++)
            {
                missile[j] = scanner.nextInt();
            }
            System.out.println(getN(missile));
        }
    }

    private static int getN(int[] missile)
    {
        int n = missile.length;
        int[] dp = new int[n];
        dp[0] =1;
        for(int i=1;i<n;i++)
        {
            int max = 0;
            for(int j=i-1;j>=0;j--)
            {
                if(missile[j] > missile[i])
                {
                    if(dp[j]>max)
                    {
                        max = dp[j];
                    }
                }
            }
            dp[i] = max + 1;
        }
        int max=0;
        for(int i=0;i<dp.length;i++)
        {
            if(dp[i]>max)
            {
                max = dp[i];
            }
        }
        return max;
    }

}
