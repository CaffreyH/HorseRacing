package townsMan;

/**
 * Created by Caffrey on 2017/8/13.
 */
import java.util.Scanner;

/**
 * @author i-yuheng
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        while (N != 0 || M != 0) {
            int[] value = new int[N + 1];
            int result = -1;
            for (int i = 1; i < value.length; i++) {
                value[i] = i;
            }
            for (int i = 0; i < M; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                int tmp = value[b];
                for (int j = 1; j < value.length; j++) {
                    if (value[j] == tmp) value[j] = value[a];
                }
            }
            for (int i = 1; i < value.length; i++) {
                if (value[i] == value[1]) result++;
            }
            System.out.println(result);
            N = scan.nextInt();
            M = scan.nextInt();
        }
        scan.close();
    }
}
