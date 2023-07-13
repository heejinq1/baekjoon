import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 28113
	public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Anything");
        }
        else if(a<b){
            System.out.println("Bus");
        }
        else
            System.out.println("Subway");
        
        
	}
}
