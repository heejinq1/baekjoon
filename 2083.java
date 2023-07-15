import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 2083
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String input = br.readLine();
            if(input.equals("# 0 0")){
                break;
            }
            else{
                String[] member = input.split(" ");
                int age = Integer.parseInt(member[1]);
                int weight = Integer.parseInt(member[2]);
                if(age > 17 || weight >=80){
                    System.out.println(member[0]+ " Senior");
                }
                else{
                    System.out.println(member[0]+" Junior");
                }
            }
        }




    }
}
