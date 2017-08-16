package editor;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Caffrey on 2017/8/6.
 */
public class Main3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        while(scanner.hasNextLine())
        {
            String s = scanner.nextLine();
            char[] c = new char[s.length()];
            Stack<Character> ch = new Stack<Character>();
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='#')
                {
                    if(!ch.isEmpty())
                    {
                        ch.pop();
                    }
                }
                else if(s.charAt(j)=='@')
                {
                   ch.clear();
                }
                else
                {
                    ch.push(s.charAt(j));
                }
            }
            /*while (!ch.isEmpty())
            {
                System.out.print(ch.pop());
            }*/
            char[] last = new char[s.length()];
            int ss = ch.size();
            for(int m=0;m<ss;m++)
            {
                last[m] = ch.pop();
            }
            System.out.println(last);
           // System.out.println();
        }
    }

}
