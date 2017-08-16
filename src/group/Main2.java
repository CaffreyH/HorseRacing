package group;

/**
 * Created by Caffrey on 2017/8/7.
 */
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            int num = 0;
            int sum = 0;
            for(int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                sum += a[i];
                if(sum > m) {
                    num ++;
                    sum = a[i];
                }
            }
            System.out.println(num + 1);
        }
    }

}
