import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    // 2441
    public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "";
        for(int i = 0 ; i < n; i++){
            star+="*";
        }
        String space = "";
        for(int j =0; j< n ; j++){
            System.out.println(space+star);
            space+=" ";
            star=star.substring(1);
        }

	}
}
