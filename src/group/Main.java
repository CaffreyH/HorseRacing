package group;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/7.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int m = scanner.nextInt();
        int[] student = new int[N];
        for(int i=0;i<N;i++)
        {
            student[i] = scanner.nextInt();
        }
        int bus = 1;
        int mm = m;
        for(int i=0;i<N;i++)
        {
            if(mm-student[i]>=0)
            {
                 mm = mm - student[i];
                 System.out.print("旧车"+ mm + " ");
            }
            else
            {
                mm = m;
                bus++;
                mm = mm - student[i];
                System.out.println("新车" + mm+ " ");
            }
            System.out.println(bus);
        }
        System.out.println(bus);
    }
}
