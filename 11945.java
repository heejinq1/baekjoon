import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 11945
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] temp = br.readLine().split(" ");
        int n= Integer.parseInt(temp[0]);
        for(int i=0;i<n;i++){
            String fish=br.readLine();
            for(int j= fish.length()-1; j>=0; j--){
                System.out.print(fish.charAt(j));
            }
            System.out.println();
        }

    }
}
