package boyi;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/11.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        /*for(int i=1;i<m;i++)
        {
          System.out.println((3.60*n+x)/(n+1.0)*p/q);
        }*/
        float b = n*q+q-n*p;
        float a  = p*x;
        float c = a/b;
        if(c>m)
        {
            c=m;
        }
        if(c<1)
        {
            c=1;
        }
        System.out.printf("%.2f",c);
    }
}
