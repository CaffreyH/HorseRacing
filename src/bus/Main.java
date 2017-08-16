package bus;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/7/31.
 */
public class Main {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;
        int max = 0;
        int []a = new int[n];
        int []b = new int[n];
        for(int i=0;i<n;i++)
        {
            num = num - scanner.nextInt() + scanner.nextInt();
            if(max<num)
            {
                max = num;
            }
        }
    System.out.print(max);
    }
}
