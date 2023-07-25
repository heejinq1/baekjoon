import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 5300

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String result ="";
		for(int i =1; i<= n; i++){
			if((i%6 ==0)){
				result+=Integer.toString(i)+" Go! ";
			}
			else{
				result+=Integer.toString(i)+" ";
			}
		}
		if(!result.endsWith("Go! ")){
			result+="Go!";
			System.out.println(result);
		}
		else{
			System.out.println(result.substring(0, result.length()-1));
		}

        
    }
	
}
