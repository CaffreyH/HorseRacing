package transferFlower;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/10.
 */
public class myMain {
    static int N=0;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(getN(m,0));
    }

    public static int getN(int m,int n)
    {
        if(m>=0 && n>=0)
        {
            if(m==0 && n==0)
            {
                return 1;
            }
            else
            {
                return getN(m-1,(n-1+N)%N)+getN(m-1,(n+1)%N);
            }
        }
        else return 0;
    }
}
