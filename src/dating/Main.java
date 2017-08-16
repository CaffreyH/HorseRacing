package dating;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/4.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = Math.abs(scanner.nextInt());
        int b = Math.abs(scanner.nextInt());
        int s = scanner.nextInt();
        if(a+b>s)
        {
            if(s%2==0 && (a+b)%2==0)
            {
                System.out.print("yes");
            }
            else if(s%2!=0 && (a+b)%2!=0)
            {
                System.out.print("yes");
            }
            else
                System.out.print("no");
        }
        else
            System.out.print("no");
    }
}
