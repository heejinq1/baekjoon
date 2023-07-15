import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 2908
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int first1 = sc.nextInt();
        int second1 = sc.nextInt();
        String first =Integer.toString(first1);
        String second= Integer.toString(second1);
        String temp1="";
        String temp2="";
        for(int i=first.length()-1; i>=0; i--){
            temp1+=first.charAt(i);
        }
        for(int j=second.length()-1; j>=0; j--){
            temp2+=second.charAt(j);
        }
        int result1 = Integer.parseInt(temp1);
        int result2 = Integer.parseInt(temp2);
        System.out.println(result1>=result2? result1: result2);
    }
}
