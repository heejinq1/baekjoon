import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	// 14912

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int result =0;
		for(int i =1; i<=n ; i++){
			if(Integer.toString(i).length()>1){
				for(int j =0; j < Integer.toString(i).length(); j++){
					if(Integer.toString(i).charAt(j)==temp[1].charAt(0)){
						result++;
					}

				}
			}
			else{
				if(Integer.toString(i).contains(temp[1])){
					result++;
				}
			}
		}
		System.out.println(result);
		
	}

}
