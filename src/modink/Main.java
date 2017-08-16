package modink;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/14.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int[] pao = new int[6];
        for(int i=0;i<6;i++)
        {
            pao[i] = scanner.nextInt();
        }
        int x0 = scanner.nextInt();
        int y0 = scanner.nextInt();
        int num = 0;
        for(int i=0;i<5;i=i+2)
        {
            System.out.println(pao[i]+" "+pao[i+1]);
        }
        for(int i=0;i<5;i=i+2)
        {
            if((pao[i]-x0) * (pao[i]-x0) +(pao[i+1]-y0)+(pao[i+1]-y0)<=r*r)
            {
                num++;
                System.out.println(num+"  ");
            }
        }
        System.out.println(num+"X");
    }
}
