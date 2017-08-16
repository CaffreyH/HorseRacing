package poem;

/**
 * Created by Caffrey on 2017/8/8.
 */
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sin =new Scanner(System.in);
        int n=sin.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sin.nextInt();
        }
        int m=sin.nextInt();
        int b[]=new int[m];
        int c[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sin.nextInt();
            c[i]=sin.nextInt();
        }
        Arrays.sort(a);

        int  bag[]=new int[a[n-1]+1];
        bag[0]=1;
        for(int i=0;i<bag.length;i++){
            if(bag[i]!=0){
                for(int j=0;j<m;j++){
                    if((i+b[j])<=a[n-1]&&((bag[i+b[j]]>bag[i]+c[j])||bag[i+b[j]]==0)){
                        bag[i+b[j]]=bag[i]+c[j];
                    }
                }
            }
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(bag[a[i]]!=0&&(bag[a[i]]<min)){
                min=bag[a[i]];
            }
        }
        if(min==Integer.MAX_VALUE){
            System.out.println("It is not true!");
        }else{
            System.out.println(min-1);
        }
    }

}
