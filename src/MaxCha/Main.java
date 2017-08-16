    package MaxCha;

    import java.util.ArrayList;
    import java.util.Scanner;
    import java.util.Stack;


    /**
     * Created by Caffrey on 2017/8/14.
     */
    public class Main {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] line = new int[n];

            ArrayList<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                int input = scanner.nextInt();
                l.add(i,input);
                line[i] = input;
            }
            int min = Integer.MAX_VALUE;
            ArrayList<Integer> result = new ArrayList<>();
            int ri=0;
            for(int i=0;i<l.size();i++)
            {
                int t = l.get(i);
                l.remove(i);
                result.add(getMax(l));
                l.add(i,t);

            }
            for(int i=0;i<result.size();i++)
            {
                if(result.get(i)<min)
                {
                    min = result.get(i);
                }
            }
            System.out.println(min);

        }
        public static int getMax(ArrayList<Integer> al)
        {
            int max = 0;
            for(int i=0;i<al.size()-1;i++)
            {
                if(al.get(i+1)-al.get(i) > max)
                {
                    max = al.get(i+1)-al.get(i);
                }
            }
            return max;
        }
    }
