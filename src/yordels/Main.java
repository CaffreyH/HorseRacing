package yordels;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/7/31.
 */
public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char a[] = new char[s.length()];

        String n = scanner.nextLine();
        int num =0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c))
            {
                a[i] = '1';
            }
            else
            {
                a[i] = '0';
            }
        }

        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i) == a[i])
            {
                num++;

            }
        }
        System.out.printf("%.2f",(float) num/s.length()*100);
        System.out.printf("%%");
    }
}
