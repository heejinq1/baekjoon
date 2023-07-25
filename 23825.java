import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	// 23825

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] blocks = br.readLine().split(" ");
		int s= Integer.parseInt(blocks[0]);
		int a = Integer.parseInt(blocks[1]);
		s= s/2;
		a= a/2;
		if(a<s){
			System.out.println(a);
		}
		else{
			System.out.println(s);
		}

	}

}
