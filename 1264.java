import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 1264
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);

        for(;;) {
            String str = sc.nextLine();
            int count = 0;
            if(str.equals("#")) {
                break;
            }

            str = str.toLowerCase();

            for(int i=0; i<str.length(); i++) {
               switch(str.charAt(i)) {
                     case 'a':
                     case 'e':
                     case 'i':
                     case 'o':   
                     case 'u':
                        count++;
                    default: 
                        break;
               }
            }            
            System.out.println(count);
        }

    }
}
