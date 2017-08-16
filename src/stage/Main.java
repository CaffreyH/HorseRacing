package stage;

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
            System.out.print(getNum(a));
        }
    }

    public static int getNum(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else if(n==3)
        {
            return 2;
        }
        else return getNum(n-1)+getNum(n-2);
    }
}
