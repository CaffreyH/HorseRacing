package huiwenchuan;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/7.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] s = line.toCharArray();
        StringBuilder sb = new StringBuilder(line);
        int result = 0;
        for(int i=0;i<line.length();i++)
        {
            char c = sb.charAt(i);
            sb.deleteCharAt(i);
            result = result + isH(sb);
            sb.insert(i,c);
        }
        if(result >=1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }


    }

    public static int isH(StringBuilder line)
    {
        for(int i=0;i<line.length();i++)
        {
            if(line.charAt(i) != line.charAt(line.length()-i-1))
            {
                return 0;
            }
        }
        return 1;
    }

}
