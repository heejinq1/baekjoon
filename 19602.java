import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	// 19602

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);

		int s = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int score = (s)+(2*m)+(3*l);
		if(score>=10){
			System.out.println("happy");
		}
		else{
			System.out.println("sad");
		}

	}

}
