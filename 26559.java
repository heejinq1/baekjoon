import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	// 26559

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_cases = Integer.parseInt(br.readLine());
		for(int i =0; i< test_cases; i++){
			StringBuilder sb = new StringBuilder();
			int size = Integer.parseInt(br.readLine());
			String[] names = new String[size];
			int[] num = new int[size];
			for(int j =0; j< size; j++){
				names[j] = br.readLine();
				num[j] = Integer.parseInt(names[j].substring(names[j].indexOf(" ")+1));
			}
			Arrays.sort(num);
			for(int k = num.length-1; k>=0; k--){
				for(int l =0; l<names.length; l++){
					if(num[k] == Integer.parseInt(names[l].substring(names[l].indexOf(" ")+1))){
						sb.append(names[l].subSequence(0, names[l].indexOf(" "))).append(", ");
						break;
					}
				}
			}
			sb.deleteCharAt(sb.length()-1);
			sb.deleteCharAt(sb.length()-1);
			System.out.println(sb);
			
		}

	}

}
