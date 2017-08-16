package table;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/7.
 */
public class Main {
    public static void main(String[] aegs)
    {
        Scanner scanner = new Scanner(System.in);
        long r = scanner.nextInt();
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long d = scanner.nextInt();
        double result =Math.sqrt((c-a)*(c-a) + (d-b)*(d-b))  ;
        System.out.println(3000000 -1000000);
        if(result%r ==0)
        {
           System.out.println((long)result/ (2*r));
        }
        else
        {
            System.out.println( (int) (result / (2*r))+1);
        }
    }
}
