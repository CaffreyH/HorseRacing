package postgraduate;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/4.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=0;i<N;i++)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if(a>=60 && b>=60 && c>=90 && d>=90 && a+b+c+d >310)
            {
                if(a+b+c+d>=350)
                {
                    System.out.print("Gongfei");
                }
                else if(310<=a+b+c+d && a+b+c+d<=349)
                    System.out.print("Zifei");
            }
            else
                System.out.print("Fail");
        }
    }
}
