package editor;

/**
 * Created by Caffrey on 2017/8/6.
 */
import java.util.Scanner;

public class Main2 {
    public static void algorithm(char[] strArr) {
        int writePos = 0;
        for (int i = 0; i < strArr.length; i++)
            if (strArr[i] == '@')
                writePos = 0;
            else if (strArr[i] == '#'){
                if (writePos != 0)
                    writePos--;}
            else
                strArr[writePos++] = strArr[i];
        System.out.println(String.valueOf(strArr, 0, writePos));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++)
            algorithm(sc.nextLine().toCharArray());
    }
}
