import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 10768
    public static void main(String args[]) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        if (a1 == 2 && a2 == 18) {
            System.out.println("Special");
        } else if ((a1 == 2 && a2 < 18)|| (a1==1)) {
            System.out.println("Before");
        } else
            System.out.println("After");

    }
}
