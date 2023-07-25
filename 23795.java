import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	// 23795

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		int bet = sc.nextInt();
		int sum = 0;
		while(bet!=-1){
			sum+=bet;
			bet= sc.nextInt();
		}
		System.out.println(sum);

	}

}
