package streetlight;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Caffrey on 2017/7/31.
 */
public class Main {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double length = scanner.nextInt();
        double []n = new double[num];

        for(int i=0;i<num;i++)
        {
            n[i]=scanner.nextInt();
        }
        Arrays.sort(n);
        double max = n[0] * 2;
        for(int i=0;i<n.length-1;i++)
        {
            if(max < Math.abs(n[i] - n[i+1]))
            {
                max = n[i+1] - n[i];
            }
        }
        double max2 =2* Math.abs(length - n[num-1]);
        if(max2>max)
        {
            max = max2;
        }
        System.out.printf("%.2f",max/2.0);
    }
}
