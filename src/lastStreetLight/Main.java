package lastStreetLight;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/4.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int times = scanner.nextInt();
        int[] a = new int[N+1];
        int num = 0;
        for(int i=0;i<times;i++)
        {
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            for(int l = j;l<=k;l++)
            {
                a[l] = 1;
            }
        }
        for(int i=0;i<=N;i++)
        {
            if(a[i]==0)
            {
                num++;
            }
        }
        System.out.print(num);
    }
}
