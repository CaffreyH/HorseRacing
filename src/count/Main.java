package count;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/14.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            if(n==0 && m==0 && k==0)
            {
                break;
            }
            else
            {
                int[][] a = new int[n][];
                int[] num = new int[n+1];
                int count = 1;
                int ci = 0;
                int youbiao = 0;
                int flag = 1;
                while(ci<k)
                {
                    if(flag==1)
                    {
                        youbiao++;
                    }
                    else
                    {
                        youbiao--;
                    }
                    if(youbiao==n)
                    {
                        flag = -1;
                    }
                    else if(youbiao==1)
                    {
                        flag = 1;
                    }
                    if(is7(count)==1 &&  youbiao==m)
                    {
                        count++;
                        System.out.println(youbiao+"    "+"*");
                        ci++;
                    }
                    else
                    {
                        System.out.println(youbiao+"   "+count);
                        count++;
                    }
                }
                System.out.println("   asf      "+(count-1));
               // System.out.println(is7(17));
            }

        }
    }
    public static int is7(int n)
    {
        if(n%7==0)
        {
            return 1;
        }
        else
        {
            StringBuilder sb = new StringBuilder();
            sb.append(n);
           for(int i=0;i<sb.length();i++)
           {
               if(sb.charAt(i)=='7')
               {
                   return 1;
               }
           }
           return 0;
        }

    }
}
