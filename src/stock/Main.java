package stock;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/7/30.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            int begin = 1;
            int a = 0;
            int n = scanner.nextInt();
            if(n==1)
            {
                System.out.println(begin);
            }
            else
            {
                n= n-1;
                int i=1;
                int j = 1;
                for(;n>0;)
                {


                    if(j<0)
                    {
                        n = n -1;
                        j = j * -1;
                        begin = begin - 1;
                        //break;
                    }
                    else
                    {
                        for(int k =1;n>0 && k<=i;k++)
                        {
                            n = n - 1;
                            begin = begin + 1;

                        }
                        j = j * -1;
                        i++;
                        //break;
                    }
                }
                System.out.println(begin);
            }
        }

    }
}
