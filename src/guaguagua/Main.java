package guaguagua;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/14.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = n;
        while(n>=0)
        {
            if(n>=3)
            {
                n = n-3;
                n++;
                num++;
                System.out.println(n);
            }
            else
                break;
        }
        System.out.println(num);
    }
}
