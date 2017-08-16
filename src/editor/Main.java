    package editor;

    import java.util.Scanner;

    /**
     * Created by Caffrey on 2017/8/6.
     */
    public class Main {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.nextLine();
            for(int i=0;i<N;i++)
            {
                String s = scanner.nextLine();
                char[] c = new char[s.length()];
                char[] c1 = new char[s.length()];
                int k = 0;
                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(j)=='#')
                    {
                        if(k>=1)
                        {
                            k--;
                            c[k] = '\0';
                        }

                    }
                    else if(s.charAt(j)=='@')
                    {
                        k=0;
                        c = new char[s.length()];
                    }
                    else
                    {
                        c[k] = s.charAt(j);
                        k++;
                    }
                }
                for(int m=0;m<c.length;m++)
                {
                    System.out.print(c[m]);
                }
               // System.out.println(String.format(c.toString()));
                System.out.println();
            }
        }

    }