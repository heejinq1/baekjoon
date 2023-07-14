import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 2744
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = "";
        for(int i =0; i< input.length();i++){
            if(input.charAt(i)>=65 && input.charAt(i)<=90){
                output+=Character.toString(input.charAt(i)+32);
            }
            else{
                output+=Character.toString(input.charAt(i)-32);
            }
        }
        System.out.println(output);
    }
}
