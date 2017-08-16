package reversalArray;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/7/30.
 */
public class Main2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[4];
        boolean flag = false;
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
                b[0] = a[i];
                b[1] = a[i+1];
                turn ++;
            }
            else if(!shun && a[i]<a[i+1])
            {
                b[2] = a[i];
                b[3] = a[i+1];
                turn ++;
                shun = true;
            }
        }

        for(int i=0;i<4;i++)
        {
            System.out.println(b[i]);
        }

        if(b[2]>b[0] &&  b[1]<b[3])
        {
            flag = true;
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
/*
* 46
        10 12 17 19 20 21 22 24 25 26 27 28 29 30 32 37 42 43 47 48 50 51 52 56 87 86 81 79 74 71 69 67 66 65 60 59 57 89 91 92 94 96 97 98 99 100
* */