import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 4101
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while (!input.equals("0 0")) {
            input = br.readLine();
            String result = "";
            if ((Integer.parseInt(input.substring(0, input.indexOf(" "))) > (Integer
                    .parseInt(input.substring(input.indexOf(" ") + 1))))) {
                result = "Yes";
            } else
                result = "No";
            if ((!input.equals("0 0")))
                System.out.println(result);
        }
    }
}
