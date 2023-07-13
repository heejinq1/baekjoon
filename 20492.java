import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 20492
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        double first = a*0.78;
        double second = a-((a*0.2)*0.22);
        System.out.println((int)first +" "+ (int)second);
        
	}
}
