package bear;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/1.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = N+1;

        for(int i=0;i<N-1;i++)
        {
           num = N * num + 1;
        }
        System.out.print(num);
    }
}
