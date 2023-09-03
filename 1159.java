import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

	// 1159

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabets = new int[26];
        int n = Integer.parseInt(in.readLine());
        for(int i =0; i< n; i++){
            String temp = in.readLine();
            alphabets[temp.charAt(0)-97]++;
        }
        String result="";
        for(int j = 0; j < alphabets.length; j++){
            if(alphabets[j]>=5){
                int tempp = j+97;
                result+=Character.toString(tempp);
            }
        }

        if(result.isEmpty()){
            System.out.println("PREDAJA");
        }
        else
        System.out.println(result);
	}

}
