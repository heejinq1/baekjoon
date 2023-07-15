import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 15726
    public static void main(String args[]) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();
        System.out.println(((a1*a2)/a3)>((a1/a2)*a3)?(int)((a1*a2)/a3):(int)((a1/a2)*a3));

    }
}
