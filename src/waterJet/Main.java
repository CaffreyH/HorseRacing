package waterJet;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/10.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] radio = new double[n];
        int k =0;
        while (scanner.hasNext())
        {
            radio[k++] = scanner.nextDouble();
        }

        Arrays.sort(radio);
        double length = 0;
        int num =0;
        for(int i=n-1;i>=0;i--)
        {
            length = length  +  Math.sqrt(radio[i] * radio[i] -1);
            num++;
            if(length>=10)
            {
                break;
            }
        }
        System.out.println(num);
    }
}
