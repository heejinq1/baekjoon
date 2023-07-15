import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 2675
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i < t; i++){
            String[] temp = (br.readLine()).split(" ");
            int times = Integer.parseInt(temp[0]);
            String word = temp[1];
            for(int j=0; j<word.length(); j++){
                for(int k=0; k< times; k++){
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
