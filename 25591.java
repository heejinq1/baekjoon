import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

    // 25591
    public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y = sc.nextInt();

        int a = 100-x;
        int b = 100-y;
        int c = 100 -(a+b);
        int d = a*b;
        int q = d/100;
        int r = d%100;
        
        System.out.println(a+ " " + b + " "+ c + " " + d + " "+ q + " "+ r);
        System.out.println(((x*y)/100)+" "+ (x*y)%100);

	}
}
