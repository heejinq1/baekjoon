import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 1259

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
        String a = br.readLine();
		while(!a.equals("0")){
			String temp ="";
			for(int i = a.length()-1; i>=0; i--){
				temp+=a.charAt(i);
			}
			if(temp.equals(a)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
			a=br.readLine();
		}
    }
	
}
