import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 2935

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
		
		BigInteger a = new BigInteger(br.readLine());
		String func = br.readLine();
		BigInteger b = new BigInteger(br.readLine());
		
		if(func.equals("*")){
			System.out.println(a.multiply(b));
		}
		else{
			System.out.println(a.add(b));
		}
        
    }
	
}
