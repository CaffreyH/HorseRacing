package transferFlower;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/10.
 */
public class Main {
    public static void main(String[] args) {
// TODO Auto-generated method stub
// 解析：第m次回到小赛手里的情况有dp[m][n]次，则即计算第m-1次花在小赛左右的情况的个数，为dp[m-1][n+1]+dp[m-1][n-1]
// 又
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] dp = new int[m + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = dp[i - 1][(j-1+n)%n] + dp[i - 1][(j + 1) % n];
            }
        }
        System.out.println(dp[m][0]);
    }
}

