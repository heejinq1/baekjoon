import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    // 10817
    public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a>=b && a<=c) || (a>=c && a<=b)){
            System.out.println(a);
        }
        else if((b>=a && b<=c)|| (b>=c && b<=a)){
            System.out.println(b);
        }
        else
            System.out.println(c);

	}
}
