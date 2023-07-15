import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    // 10988
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
 
		String s = sc.nextLine();
        String temp = "";
        for(int i = s.length()-1; i>=0; i--){
            temp+=s.charAt(i);
        }
        System.out.println(s.equals(temp)?1:0);
    }
}
