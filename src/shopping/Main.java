package shopping;

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
        int value = scanner.nextInt();
        int[] weight = new int[n];
        for(int i=0;i<n;i++)
        {
            weight[i] = scanner.nextInt();
        }
        int num = 0;
        Arrays.sort(weight);
        for(int i=0;i<n;i++)
        {
            if(value>=weight[i])
            {
                value = value - weight[i];
                num ++;
            }
            else
            {
                break;
            }
        }
        System.out.println(num);
    }
}
