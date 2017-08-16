package pushUp;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/14.
 */
public class Main {
    static int  n;
    static int k;
    static int T;
    static int result=0;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        T = scanner.nextInt();
        //System.out.println(n+" "+k+" "+T);
        get(1,1);
        System.out.println(result);
    }
    public static void get(int begin,int add)
    {
        result = result + begin;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<add ;j++)
            {
                if(begin>=  k-1)
                {
                    begin = -1;
                }
                begin = begin+1;
            }
            //System.out.print(begin+" ");
            add++;
        }
        if(T>1)
        {
            T--;
           // System.out.println(T+"调用1次   "+begin+" "+add);
            get(begin,add);
        }
    }
}
