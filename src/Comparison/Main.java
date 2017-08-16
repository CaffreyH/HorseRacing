package Comparison;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/4.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String av = scanner.nextLine();
        char[] a = new char[12];
        for (int i = 0; i < n; i++) {
            int result = 1;
            a = scanner.nextLine().toCharArray();
           // System.out.print(a);
            for (int j = 0; j < a.length; j++)
            {

                result = result + (a[j]-'a') * jiecheng(a.length-j-1);

                for(int k = j; k <a.length; k++ )
                {
                    if(a[k] > a[j])
                    {
                        a[k] --;
                    }
                }
            }
            System.out.println(result);
        }
    }
       public static int jiecheng(int n)
    {
        int result = 1;
        for(int i=1;i<=n;i++)
        {
            result = result * i;
        }
        return result;
    }

}
