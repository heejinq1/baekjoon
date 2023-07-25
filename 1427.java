import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	// 1427

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] list=  (br.readLine()).toCharArray();

		Arrays.sort(list);
		String result = "";
		for(int i = list.length-1; i>=0; i--){
			result+=list[i];
		}
		System.out.println(result);

	}

}
