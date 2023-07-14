import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

    // 14489
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String account = br.readLine();
        int price = Integer.parseInt(br.readLine())*2;
        int first = Integer.parseInt(account.substring(0, account.indexOf(" ")));
        int second = Integer.parseInt(account.substring(account.indexOf(" ")+1));
        if((first + second) >= price){
            System.out.println((first+second)-price);
        }
        else{
            System.out.println(first+second);
        }
	}
}
