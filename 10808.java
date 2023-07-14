import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 10808
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        String word = sc.nextLine();
        int[] alpha = new int[26];
        for(int i =0; i< word.length();i++){
            alpha[word.charAt(i)-97]++;
        }

        for(int j=0; j< alpha.length; j++){
            System.out.print(alpha[j]+" ");
        }
	}
}
