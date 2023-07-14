import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 2443
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star= "*";
        String space = "";

        for(int j =0; j<n-1; j++){
            star="*"+star+"*";
        }
         for(int i =0 ; i< n-1 ; i++){
            System.out.println(space+star);
            star=star.substring(2);
            space+=" ";
        }
        System.out.println(space+star);
    }
}
