import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	// 20499

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split("/");
		if(temp[1].equals("0") || (Integer.parseInt(temp[0])+Integer.parseInt(temp[2]))<Integer.parseInt(temp[1])){
			System.out.println("hasu");
		}
		else{
			System.out.println("gosu");
		}

	}

}
