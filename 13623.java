import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	// 13623

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		if (temp[0].equals(temp[1]) && temp[1].equals(temp[2])) {
			System.out.println("*");
		} else if (temp[0].equals(temp[1]) && !temp[0].equals(temp[2])) {
			System.out.println("C");
		} else if (temp[1].equals(temp[2]) && !temp[0].equals(temp[2])){
			System.out.println("A");

		} else {
			System.out.println("B");
		}

	}

}
