import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 10872
	public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(1);
        }
        else{
            int result = 1;
            for(int i =n; i>0;i--){
                result*=i;
            }
            System.out.println(result);
        }
        

	}
}
