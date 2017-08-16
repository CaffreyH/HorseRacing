package isNotMyFault;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/10.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int m = scanner.nextInt();
        int times = 0;
        for(int i=l;i<=r;i++)
        {
            String a = Integer.toBinaryString(i);
            int num = 0;
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(j)=='1')
                {
                    num++;
                }
            }
            if(num == m)
            {
                times++;
            }
        }
        if(times >=1 )
        {
            System.out.println(times);
        }
        else if(l<=0 && times==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
