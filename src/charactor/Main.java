package charactor;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/11.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        StringBuilder sb = new StringBuilder(b);
        StringBuilder sa = new StringBuilder(a);
        int num = 0;
        for(int i=0;i<sb.length();i++)
        {
            int ll = sa.length();
            for(int j=0;j<ll;j++)
            {
                if(sb.charAt(i) == sa.charAt(j))
                {
                    num++;
                    System.out.println(sb.charAt(i));
                    sa.deleteCharAt(j);
                    break;
                }
            }
        }
        System.out.println(num);
        if(num == sb.length())
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }

}
