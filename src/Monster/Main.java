package Monster;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/8.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int n =scanner.nextInt();
            long init = scanner.nextInt();
            long[] monster = new long[n];

            for(int i=0;i<n;i++)
            {
                monster[i] = scanner.nextInt();
            }

            for(int i=0;i<n;i++)
            {
                if(init>=monster[i])
                {
                    init = init + monster[i];
                }
                else
                {
                    init = init + getN(init,monster[i]);
                }
            }
            System.out.println(init);
        }

    }
    public static long getN(long m,long n)
    {
        long a = Math.max(m,n);
        long b = Math.min(m,n);
        for(long i=b;i>0;i--)
        {
            if(a%i==0  && b%i==0)
            {
                return i;
            }
        }
        return 0;
    }

}
