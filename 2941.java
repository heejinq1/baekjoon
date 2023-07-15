import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    // 2941
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
 
		String s = sc.nextLine();
        s=s.replaceAll("c=", "1");
        s=s.replaceAll("c-", "1");
        s=s.replaceAll("dz=", "1");
        s=s.replaceAll("d-", "1");
        s=s.replaceAll("lj", "1");
        s=s.replaceAll("nj", "1");
        s=s.replaceAll("s=", "1");
        s=s.replaceAll("z=", "1");
        System.out.println(s.length());
    }
}
