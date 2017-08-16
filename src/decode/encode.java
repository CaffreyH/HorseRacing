package decode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/9.
 */
public class encode {

    static HashMap<Character,Integer> table = new HashMap<Character, Integer>();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = new String[n];
        for(int i=0;i<n;i++)
        {
            s[i] = scanner.nextLine();
        }
        int m = 0;
        for(int i=0;i<10;i++)
        {
            table.put((char)i,m);
            m++;
        }
        table.put('+',m);
        m++;
        table.put('-',m);
        m++;
        for(int i=0;i<26;i++)
        {
            table.put((char)('a'+i),m);
            m++;
        }
        for(int i=0;i<26;i++)
        {
            table.put((char)('A'+i),m);
            m++;
        }
        char[] use = new char[3];
        String u;
        for(int i=0;i<n;i++)
        {

            u = s[i].substring(i,i+3);
            i=i+2;
            encode(u);
            /*for(int j=0;j<s[i].length()-3;j++)
            {
                u = s[i].substring(i,i+3);
                i=i+2;
                encode(u);
            }*/

        }
    }

    public static void encode(String s)
    {
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<3;i++)
        {
            StringBuilder temp = new StringBuilder();
            temp.append(Integer.toBinaryString(table.get(s.charAt(i))));
            while (temp.length()<8){
                temp.insert(0,0);
            }
            sb.append(temp);
        }
        StringBuilder s1 = new StringBuilder(sb.substring(0,6));
        StringBuilder s2 = new StringBuilder(sb.substring(6,12));
        StringBuilder s3 = new StringBuilder(sb.substring(12,18));
        StringBuilder s4 = new StringBuilder(sb.substring(18,24));
        System.out.println(s1);
        s1.insert(0,0);
        s1.insert(0,0);
        s2.insert(0,0);
        s2.insert(0,0);
        s3.insert(0,0);
        s3.insert(0,0);
        s4.insert(0,0);
        s4.insert(0,0);
        System.out.println(sb);
        System.out.println(s1);
        int a = Integer.parseInt(s1.toString(),2);
        char tab = ' ';
        for(int i=0;i<table.size();i++)
        {
            if(table.get(i)==a)
            {
                //ch = i;
            }
        }
        System.out.println("a"+a);
    }

}
