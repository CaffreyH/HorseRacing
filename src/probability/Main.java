    package probability;

    import java.util.Scanner;

    /**
     * Created by Caffrey on 2017/8/11.
     */
    public class Main {

        static int n;
        static int a;
        static int b;
        static int x;
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            a = scanner.nextInt();
            b = scanner.nextInt();
            x = scanner.nextInt();
            int len = b - a + 1;
            double all = 1;
            for(int i=0;i<n;i++)
            {
                all = len * all;
            }
            int result = getN(n,x);
            System.out.println(result +" "+ all+" "+result / all);
            System.out.printf("%.4f",result/all);

        }
        public static int getN(int n,int x)
        {
            int num =0;
            if(n==2)
            {
                for(int i=a;i<=b;i++)
                {
                    for(int j=a;j<=b;j++)
                    {
                        if(i+j==x)
                        {
                            num++;
                        }
                    }
                }
            }
            else
            {
                for(int i=a;i<=b;i++)
                {
                    num  = num+getN(n-1,x-i);}
            }
            return num;
        }
    }
