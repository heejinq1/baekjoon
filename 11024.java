import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 11024
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int k = 0; k < n; k++) {
            String[] numbers = (br.readLine()).split(" ");
            int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result += (Integer.parseInt(numbers[i]));
            }
            System.out.println(result);
        }

    }
}
