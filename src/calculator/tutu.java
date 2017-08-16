package calculator;

        import java.util.PriorityQueue;
        import java.util.Queue;
        import java.util.Scanner;

/**
 * Created by cindy on 2017/7/31.
 */
public class tutu {
    public static Queue<Integer> queue = new PriorityQueue<Integer>();
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            int n = input.nextInt();

            isPrime(n);
            int size= queue.size();
            int[] queue2 = new int[size];
            for(int i=0;i<size;i++){
                queue2[i] = queue.poll();
            }
            for(int j=1;j<6;j++){
                for(int i=0;i<size;i++){
                    printNums(queue2[i],j);
                    if(i!=size-1){
                        printMul(j);
                    }
                }
                System.out.println();
            }
        }
    }

    public static void isPrime(int n){
        //System.out.println((int)Math.sqrt(n));
        for (int i=2;i<Math.sqrt(n);i++){

            if(n%i == 0){
                int mul1 = i;
                int mul2 = n/i;
                isPrime(mul1);
                isPrime(mul2);
                return;
            }
        }
//        System.out.println(n);
        queue.add(n);
    }

    public static void printNums(int num,int row){
        while(num/10 != 0){
            printNums(num/10,row);
            break;
        }
        printNum(num%10,row);
    }
    public static void printMul(int row){
        switch (row){
            case 1:
                System.out.print(" ");
                break;
            case 2:
                System.out.print(" ");
                break;
            case 3:
                System.out.print("*");
                break;
            case 4:
                System.out.print(" ");
                break;
            case 5:
                System.out.print(" ");
                break;
        }
    }

    public static void printNum(int num,int row){
        switch (row){
            case 1:
                switch(num){
                    case 0:
                        System.out.print(" - ");
                        break;
                    case 1:
                        System.out.print("   ");
                        break;
                    case 2:
                        System.out.print(" - ");
                        break;
                    case 3:
                        System.out.print(" - ");
                        break;
                    case 4:
                        System.out.print("   ");
                        break;
                    case 5:
                        System.out.print(" - ");
                        break;
                    case 6:
                        System.out.print(" - ");
                        break;
                    case 7:
                        System.out.print(" - ");
                        break;
                    case 8:
                        System.out.print(" - ");
                        break;
                    case 9:
                        System.out.print(" - ");
                        break;
                }
                break;
            case 2:
                switch (num){
                    case 0:
                        System.out.print("|");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 1:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 2:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 3:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 4:
                        System.out.print("|");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 5:
                        System.out.print("|");
                        System.out.print(" ");
                        System.out.print(" ");
                        break;
                    case 6:
                        System.out.print("|");
                        System.out.print(" ");
                        System.out.print(" ");
                        break;
                    case 7:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 8:
                        System.out.print("|");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 9:
                        System.out.print("|");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                }
                break;
            case 3:
                switch (num){
                    case 0:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print(" ");
                        break;
                    case 2:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 3:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 4:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 5:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 6:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 7:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print(" ");
                        break;
                    case 8:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 9:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                }
                break;
            case 4:
                switch (num){
                    case 0:
                        System.out.print("|");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 1:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 2:
                        System.out.print("|");
                        System.out.print(" ");
                        System.out.print(" ");
                        break;
                    case 3:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 4:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 5:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 6:
                        System.out.print("|");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 7:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 8:
                        System.out.print("|");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                    case 9:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print("|");
                        break;
                }
                break;
            case 5:
                switch (num){
                    case 0:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print(" ");
                        break;
                    case 2:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 3:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 4:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print(" ");
                        break;
                    case 5:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 6:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 7:
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print(" ");
                        break;
                    case 8:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                    case 9:
                        System.out.print(" ");
                        System.out.print("-");
                        System.out.print(" ");
                        break;
                }
        }
    }
}
