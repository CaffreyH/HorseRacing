package elevator;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/7.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long xiaosai = scanner.nextInt();
        long dianti = scanner.nextInt();
        long t1 = scanner.nextInt();
        long t2 = scanner.nextInt();
        long t3 = scanner.nextInt();
        long t4 = scanner.nextInt();

        long timeX = (xiaosai-1) * t4;
        long timeE = Math.abs(dianti - xiaosai) * t1 + t2 +t2   + t3 + (xiaosai-1) * t1;
        if(timeE>timeX)
        {
            System.out.println(timeX);
        }
        else
            System.out.println(timeE);
    }
}
