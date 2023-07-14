import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Main {

    // 26711
	public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = "SciComLove";
        Scanner sc= new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        System.out.println(n.add(b));
        
       
    }
}
