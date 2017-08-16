package travel;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/14.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int m = scanner.nextInt();
        int[] distance = new int[m+1];
        int num = 0;
        for(int i=0;i<=m;i++)
        {
                distance[i] = scanner.nextInt();
        }
        for(int i=0;i<=m;i++)
        {
            if(distance[i]>N)
            {
                System.out.println(0);
                return;
            }
        }

        int n = N;
        for(int i=0;i<=m;i++)
        {
            if(n>=distance[i])
            {
                n = n -distance[i];
               // System.out.println(distance[i]+" "+n);
            }
            else
            {
                n = N;
                n = n-distance[i];
                num++;
            }

        }
        System.out.println(num);

    }
}
