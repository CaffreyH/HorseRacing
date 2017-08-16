package boll;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/14.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[4];
        for(int i=0;i<4;i++)
        {
            a[i] = scanner.nextInt();
        }

        int length = 0;
        for(int i=0;i<4;i++)
        {

            while(a[i]>=1)
            {
                length = length + a[i];
                a[i] = a[i] / 2;
                length = length + a[i];
            }
        }
        System.out.println(length);
    }
}
