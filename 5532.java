import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 5532
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int math = sc.nextInt();
        int korean = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int result1 = math/m;
        if(math%m !=0){
            result1++;
        }
        int result2 = korean/k;
        if(korean%k !=0){
            result2++;
        }

        System.out.println(result1>result2? days-result1 : days - result2);
        


    }
}
