import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 25372
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        
        for(int i =0; i < a; i++){
            String password = br.readLine();
            if(password.length()>=6 && password.length()<=9){
                System.out.println("yes");
            }
            else   
                System.out.println("no");
        }
        
	}
}
