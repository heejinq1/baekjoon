import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

    // 28097
    public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = 0;
        for(int i =0; i <n; i++){
            time+=sc.nextInt();
        }
        time+=(n-1)*8;
        System.out.println((time/24)+" "+(time%24));


	}
}
