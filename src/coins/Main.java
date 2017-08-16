package coins;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Caffrey on 2017/8/6.
 */
public class Main {

    static int num = 0;
    static int [][] map = new int[100000][11];
    static Stack<Integer> result = new Stack<Integer>();
    static int large = 0;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] time = new int[N];
        int[] position = new int[N];
        for(int i=0;i<N;i++)
        {
            position[i] = scanner.nextInt();
            time[i] = scanner.nextInt();
            map[time[i]][position[i]] ++;
        }

        for(int i=0;i<time.length;i++)
        {
            if(time[i]>large)
            {
                large = time[i];
            }
        }
        //System.out.println(large);
        getN(0,5,0);
        int size = result.size();
        int show = 0;
        for(int i=0;i<size;i++)
        {
            int a = result.pop();
            //System.out.println(a);
            if (a>show)
            {
                show = a;
            }
        }
        System.out.println(show);
    }

    public static void getN(int time,int position,int coins)
    {
        int num = coins + map[time][position];

        result.push(num);
        //System.out.println(time +" "+ position);
        if(time<large && position<10 && position>0)
        {
            getN(time+1,position-1,num);

            getN(time+1,position,num);

            getN(time+1,position+1,num);
        }
    }
}
