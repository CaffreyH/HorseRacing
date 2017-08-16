package missile;

/**
 * Created by Caffrey on 2017/8/10.
 */
import java.util.Scanner;


public class Main2 {
    private static int core(int[] arr) {
        // TODO Auto-generated method stub
        int n = arr.length;
        int[] dp = new int[n];
        //求出以每个元素结尾的最长递减子序列
        dp[0] = 1;
        for(int i=1; i<arr.length; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr[j] > arr[i]){
                    if(dp[j] > max)
                        max = dp[j];
                }
            }
            dp[i] = max+1;
        }
        int max = 0;
        for(int i=0; i<dp.length; i++){
            if(dp[i] > max)
                max = dp[i];
        }
        return max;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int[] arr;
            int n = scan.nextInt();
            for(int i=0; i<n; i++){
                int m  = scan.nextInt();
                arr = new int[m];
                for(int j=0; j<m; j++){
                    arr[j] = scan.nextInt();
                }
                System.out.println(core(arr));
            }
        }
    }



}
