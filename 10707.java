import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 10707
    public static void main(String args[]) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int companyX = sc.nextInt();
        int companyY_B = sc.nextInt();
        int companyY_C = sc.nextInt();
        int companyY_D = sc.nextInt();
        int usage = sc.nextInt();

        int price_companyX = usage * companyX;
        int price_companyY = 0;

        if (usage < companyY_C) {
            price_companyY = companyY_B;
        } else {
            price_companyY = companyY_B + ((usage - companyY_C) * companyY_D);
        }
        System.out.println(price_companyX < price_companyY ? price_companyX : price_companyY);
    }
}
