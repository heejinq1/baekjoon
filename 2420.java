import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 2420
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        System.out.println((a.subtract(b)).abs());

    }
}
