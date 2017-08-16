package calculator;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Caffrey on 2017/7/31.
 */
public class Main {
    public static Queue<Integer> num = new PriorityQueue<>();

    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            a(scanner.nextInt());
            int i=0;
            int[] n = new int[num.size()];
           while(!num.isEmpty())
            {
                n[i]=num.remove();
                i++;
            }
            for(int k=1;k<=5;k++)
            {
                for(int j=0;j<n.length;j++)
                {
                    get(n[j],k);
                    if(j<n.length-1)
                    {
                        System.out.print(printC(10,k));
                    }
                }
                System.out.println();

            }
        }
    }

    public static void get(int n,int line)
    {
        while(n/10>0)
        {
            get(n/10,line);
            break;
        }
        System.out.print(printC(n%10,line));
    }

    public static String printC(int c,int n)
    {
        if(c==0)
        {
            if(n==1)
            {
                return " "+ "-"+" ";
            }
            if(n==2)
            {
                return "|"+ " "+"|";
            }
            if(n==3)
            {
                return " "+ " "+" ";
            }
            if(n==4)
            {
                return "|"+ " "+"|";
            }
            if(n==5)
            {
                return " "+ "-"+" ";
            }

        }
        else if(c ==1)
        {
            if(n==1)
            {
                return " "+ " "+" ";
            }
            if(n==2)
            {
                return " "+ " "+"|";
            }
            if(n==3)
            {
                return " "+ " "+" ";
            }
            if(n==4)
            {
                return " "+ " "+"|";
            }
            if(n==5)
            {
                return " "+ " "+" ";
            }
        }
        else if(c ==2)
        {
            if(n==1)
            {
                return " "+ "-"+" ";
            }
            if(n==2)
            {
                return " "+ " "+"|";
            }
            if(n==3)
            {
                return " "+ "-"+" ";
            }
            if(n==4)
            {
                return "|"+ " "+" ";
            }
            if(n==5)
            {
                return " "+ "-"+" ";
            }
        }
        else if(c ==3)
        {
            if(n==1)
            {
                return " "+ "-"+" ";
            }
            if(n==2)
            {
                return " "+ " "+"|";
            }
            if(n==3)
            {
                return " "+ "-"+" ";
            }
            if(n==4)
            {
                return " "+ " "+"|";
            }
            if(n==5)
            {
                return " "+ "-"+" ";
            }
        }
        else if(c ==4)
        {
            if(n==1)
            {
                return " "+ " "+" ";
            }
            if(n==2)
            {
                return "|"+ " "+"|";
            }
            if(n==3)
            {
                return " "+ "-"+" ";
            }
            if(n==4)
            {
                return " "+ " "+"|";
            }
            if(n==5)
            {
                return " "+ " "+" ";
            }
        }
        else if(c ==5)
        {
            if(n==1)
            {
                return " "+ "-"+" ";
            }
            if(n==2)
            {
                return "|"+ " "+" ";
            }
            if(n==3)
            {
                return " "+ "-"+" ";
            }
            if(n==4)
            {
                return " "+ " "+"|";
            }
            if(n==5)
            {
                return " "+ "-"+" ";
            }
        }
        else if(c ==6)
        {
            if(n==1)
            {
                return " "+ "-"+" ";
            }
            if(n==2)
            {
                return "|"+ " "+" ";
            }
            if(n==3)
            {
                return " "+ "-"+" ";
            }
            if(n==4)
            {
                return "|"+ " "+"|";
            }
            if(n==5)
            {
                return " "+ "-"+" ";
            }
        }
        else if(c ==7)
        {
            if(n==1)
            {
                return " "+ "-"+" ";
            }
            if(n==2)
            {
                return " "+ " "+"|";
            }
            if(n==3)
            {
                return " "+ " "+" ";
            }
            if(n==4)
            {
                return " "+ " "+"|";
            }
            if(n==5)
            {
                return " "+ " "+" ";
            }
        }
        else if(c ==8)
        {
            if(n==1)
            {
                return " "+ "-"+" ";
            }
            if(n==2)
            {
                return "|"+ " "+"|";
            }
            if(n==3)
            {
                return " "+ "-"+" ";
            }
            if(n==4)
            {
                return "|"+ " "+"|";
            }
            if(n==5)
            {
                return " "+ "-"+" ";
            }
        }
        else if(c ==9)
        {
            if(n==1)
            {
                return " "+ "-"+" ";
            }
            if(n==2)
            {
                return "|"+ " "+"|";
            }
            if(n==3)
            {
                return " "+ "-"+" ";
            }
            if(n==4)
            {
                return " "+ " "+"|";
            }
            if(n==5)
            {
                return " "+ "-"+" ";
            }
        }
        else if(c ==10)
        {
            if(n==1)
            {
                return " "+ " "+" ";
            }
            if(n==2)
            {
                return " "+ " "+" ";
            }
            if(n==3)
            {
                return " "+ "*"+" ";
            }
            if(n==4)
            {
                return " "+ " "+" ";
            }
            if(n==5)
            {
                return " "+ " "+" ";
            }
        }
        return null;
    }

    public static void a(int n)
    {
        boolean last = true;
        for(int i=n-1;i>=2;i--)
        {
            if(n%i==0) {
                last = false;
                // System.out.print(n/i+" ");
                num.add(n/i);
                a(i);
                break;
            }

        }
        if(last)
        {
            //  System.out.print(n+" ");
            num.add(n);
        }

    }
}
