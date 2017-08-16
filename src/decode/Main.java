package decode;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/9.
 */
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static HashMap<Character, Integer> encodeTable = new HashMap<>();

    public static void main(String[] args) {
        encodeTable = createEncodeTable();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = scanner.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(decode(strs[i]));
        }

    }


    public static HashMap<Character, Integer> createEncodeTable() {
        HashMap<Character, Integer> table = new HashMap<>();

        int j = 0;
        for (char i = '0'; i <= '9'; i++) {
            table.put(i, j++);
        }
        table.put('+', j++);
        table.put('-', j++);
        for (char i = 'a'; i <= 'z'; i++) {
            table.put(i, j++);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            table.put(i, j++);
        }

        return table;
    }

    public static String decode(String str) {
        StringBuilder end=new StringBuilder();
        StringBuilder tmp=new StringBuilder();

        if (str.length() % 4 == 0) {
            while (str.contains("=")) {
                str = str.substring(0, str.length() - 1);
            }
            byte[] bytes = new byte[str.length()];
            char[] chars = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                bytes[i]=encodeTable.get(chars[i]).byteValue();
                StringBuilder stringBuilder=new StringBuilder(Integer.toBinaryString(bytes[i]));
                while (stringBuilder.length()<6){
                    stringBuilder.insert(0,0);
                }
                tmp.append(stringBuilder);
            }

        } else {
            end.append("Invalid");
        }

        for (int i=0;i<=tmp.length()-8;i=i+8){
            char d= (char) Integer.parseInt(tmp.substring(i,i+8),2);
            end.append(d);
        }

        return end.toString();
    }
}
