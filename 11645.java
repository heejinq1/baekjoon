import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	// 11645

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int test_cases = Integer.parseInt(br.readLine());
		for(int i =0; i< test_cases; i++){
			int cities = Integer.parseInt(br.readLine());
			String result = "";
			int count =0;
			for(int j =0; j < cities; j++){
				String city = br.readLine();
				if(!result.contains(city)){
					result+=city;
					count++;
				}
			}
			sb.append(Integer.toString(count)).append("\n");
			
		}
		System.out.println(sb);

	}

}
