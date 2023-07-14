import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 15727
	public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int l = sc.nextInt();
        int result = l/5;
        if(l%5!=0){
            result++;
        }
        System.out.println(result);
        
        
        
	}
}
