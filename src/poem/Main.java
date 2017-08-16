package poem;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Caffrey on 2017/8/7.
 */
public class Main {
    static int time2 = 0;
    static Stack<Integer> result = new Stack<Integer>();
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] limit = new int[n];
        for(int i=0;i<n;i++)
        {
            limit [i]= scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] sentence = new int[m];
        int[] time = new int[m];
        for(int i=0;i<m;i++)
        {
            sentence[i] = scanner.nextInt();
            time[i] = scanner.nextInt();
        }
        for(int i=0;i<limit.length;i++)
        {
            getT(sentence,time,limit[i],0);
        }
        int large = result.size();
        int min = 100000;
        for(int i = 0;i<large;i++)
        {
            int now = result.pop();
            if(now <min )
            {
                min = now;
            }
        }
       System.out.println(min);
    }
    public static void getT(int[] sentence,int[] time,int n,int t)
    {

        for(int i=0;i<sentence.length;i++)
        {
            if(n==sentence[i])
            {
                time2 =  t+time[i];
                //System.out.println(time2);
                result.push(time2);
                return;
            }
            else if(n>0)
            {
                time2 = t + time[i];
                getT(sentence,time,n-sentence[i],time2);
               // System.out.println("调用"+n+" " +time2);
            }

        }
    }

}
