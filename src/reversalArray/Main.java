package reversalArray;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/7/30.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[n/2];
        boolean flag = true;
        for(int i =0;i<n;i++)
        {
            a[i] = scanner.nextInt();
        }
        int turn = 0;
        boolean shun = true;
        for(int i=0;i<n-1;i++)
        {
            if( shun && a[i]>a[i+1])
            {
                shun = false;
                b[turn] = i;
                turn ++;
            }
           else if(!shun && a[i]<a[i+1])
            {
                b[turn] = i;
                turn ++;
                shun = true;
            }
        }

        for(int i=0;i<turn-1;i++)
        {
            if(a[b[i]]>a[b[i+1]+1])
            {

                flag = false;
                System.out.print("da");
            }
        }
        if(turn ==2 && flag == true)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }

}
