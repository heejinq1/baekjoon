import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 2440
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String star = "";
        for(int i=0; i < n; i++){
            star+="*";
        }
        

        for(int j=0; j< n; j++){
            System.out.println(star);
            star= star.substring(1);
        }
	}
}
