import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Main {

    // 27889
	public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Scanner sc= new Scanner(System.in);
        String school = sc.nextLine();
        switch(school){
            case "NLCS": System.out.println("North London Collegiate School"); break;
            case "BHA": System.out.println("Branksome Hall Asia"); break;
            case "KIS": System.out.println("Korea International School"); break;
            case "SJA": System.out.println("St. Johnsbury Academy"); break;
        }
        
       
    }
}
