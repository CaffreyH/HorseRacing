package countdown;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * Created by Caffrey on 2017/8/4.
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] a = date.split("-");
        SimpleDateFormat Sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = Sdf.parse(date);
        Date s = Sdf.parse("2015-10-18");
        long c = d.getTime()-s.getTime();
        System.out.print(c /(24*60*60*1000));
    }
}
