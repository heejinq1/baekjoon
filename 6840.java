import java.io.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    // 6840
    public static void main(String args[]) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int[] bears = new int[3];
        bears[0] = sc.nextInt();
        bears[1] = sc.nextInt();
        bears[2] = sc.nextInt();
        sc.close();
        Arrays.sort(bears);
        System.out.println(bears[1]);

    }
}
