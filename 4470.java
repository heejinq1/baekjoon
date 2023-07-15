import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 4470
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int lines = Integer.parseInt(br.readLine());
        for(int i =0; i< lines; i++){
            String input = br.readLine();
            System.out.println((i+1)+". "+input);
        }




    }
}
