package numberOff;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/13.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int a=cin.nextInt();
            while(a>0){
                int N=cin.nextInt();

                ArrayList<Integer> list=new ArrayList<Integer>();
                for(int i=1;i<=N;i++){
                    list.add(i);
                }
                baoshu(list,2);
                for(int i=0;i<list.size();i++){
                    System.out.print(list.get(i)+" ");
                }
                System.out.println();
                a--;
            }
        }
    }
    static void baoshu(ArrayList<Integer> list,int num){
        if(list.size()>3){
            int count=0;
            for(int i=0;i<list.size();i++){
                count++;
                if(count==num){
                    list.remove(i);
                    i--;
                    count=0;
                }
            }
            if(num==2){
                baoshu(list,3);
            }else{
                baoshu(list,2);
            }
        }
    }
}