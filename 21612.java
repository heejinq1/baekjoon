import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	// 21612

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int b = Integer.parseInt(br.readLine());
		int p = 5*b-400;
		System.out.println(p);
		if(p==100){
			System.out.println(0);
		}
		else if(p<100){
			System.out.println(1);
		} 
		else{
			System.out.println(-1);
		}

	}

}
