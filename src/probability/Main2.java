package probability;

/**
 * Created by Caffrey on 2017/8/11.
 */
import java.util.Scanner;

public class Main2{


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int x=scanner.nextInt();
            System.out.printf("%.4f",getCP(n, a, b, x));
        }

    }
    public static float getCP(int n,int a,int b,int x){

        int num=b-a+1;
        //dp[i][j]=p,表示取i个数和为j的概率为p
        float dp[][]=new float[102][102];

        for(int j=a;j<=b;j++){
            dp[1][j]=(float) (1.0/(b-a+1));
        }
		/*
		 * i的范围是取的数的个数;j是指在i个数的组合的范围;k表示的是最后一个的取值
		 * dp[i][j]+=dp[1][k]*dp[i-1][j-k]表示的是去最有一个数为k的条件下，最后
		 * 和为j的概率，即取值为k的概率乘以取值为j-k的概率
		 */
        for(int i=2;i<=n;i++){
            for(int j=i*a;j<i*b;j++){
                for(int k=a;k<=b;k++){
                    if(j>k){
                        dp[i][j]+=dp[1][k]*dp[i-1][j-k];
                    }
                }
            }
        }

        return dp[n][x];
    }

}