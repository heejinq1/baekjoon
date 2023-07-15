import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    // 2720
    public static void main(String args[]) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int q = 0;
            int d = 0;
            int n = 0;
            int p = 0;
            int change = sc.nextInt();
            q=change/25;
            change= change%25;
            d = change/10;
            change=change%10;
            n=change/5;
            change=change%5;
            p=change;
            System.out.println(q+ " "+ d+ " "+ n +" "+ p);
        }
    }
}
