package baskatball;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/8.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int n = scanner.nextInt();
        int[] baskatball = new int[n];
        long[] baskat = new long[p];
        for(int i=0;i<n;i++)
        {
            int a = scanner.nextInt();
            if(  baskat[a % p] == 1 ) {
                System.out.println(i+1);
                return ;
            }
            else
            {
                baskat[a % p] = 1;
            }
        }
        System.out.println(-1);
    }
}
