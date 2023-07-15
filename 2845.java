import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 2845
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = (br.readLine()).split(" ");
        int total = Integer.parseInt(input[1]) * Integer.parseInt(input[0]);
        String[] news = (br.readLine()).split(" ");
        for(int i = 0; i< news.length; i++){
            int result = Integer.parseInt(news[i])- total;
            System.out.print(result+ " ");
        }




    }
}
