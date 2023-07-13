import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 7891
	public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i =0; i < a; i++){
            BigInteger first = sc.nextBigInteger();
            BigInteger second = sc.nextBigInteger();
            System.out.println(first.add(second));
        }
        
	}
}
