import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    // 11721
    public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        while(word.length()>=10){
            System.out.println(word.substring(0, 10));
            word=word.substring(10);
        }
        if(word.length()>0){
            System.out.println(word);
        }
        

	}
}
