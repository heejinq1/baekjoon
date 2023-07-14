import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 10156
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int price = sc.nextInt();
        int quantity = sc.nextInt();
        int money = sc.nextInt();
        if((price*quantity)>money)
            System.out.println((price * quantity) - money);
        else
            System.out.println(0);
	}
}
