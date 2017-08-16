package threePointLine;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/8.
 */
public class Main {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int na =scanner.nextInt();
        int[] distanceA = new int[na];
        for(int i =0;i<na;i++)
        {
            distanceA[i] = scanner.nextInt();
        }
        int nb = scanner.nextInt();
        int[] distanceB = new int[nb];
        for(int i =0;i<nb;i++)
        {
            distanceB[i] = scanner.nextInt();
        }
        Arrays.sort(distanceA);
        Arrays.sort(distanceB);
        int line = 0;
        int result = 0;
        int j = 0;
        int max =Integer.MIN_VALUE;

        for(int i=0;i<na;i++)
        {
            for(;j<nb;j++)
            {
                if(distanceA[i] <= distanceB[j])
                {
                    break;
                }
            }
            result = i * 2 + (na-i) * 3 - j* 2 - (nb-j)*3;
            if(max < result)
            {
                max = result;
            }
        }

        //System.out.println(max);
        if(max<2*(na-nb))
        {
            max = 2*(na-nb);
        }
        if(max<3*(na-nb))
        {
            max = 3*(na-nb);
        }
        System.out.println(max);
    }
}
