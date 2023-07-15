import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 11365
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String input = br.readLine();
            if(input.equals("END")){
                break;
            }
            else{
                for(int i=input.length()-1; i>=0; i--){
                    System.out.print(input.charAt(i));
                }
                System.out.println();
            }
        }

    }
}
