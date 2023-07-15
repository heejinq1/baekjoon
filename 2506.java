import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 2506
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] list = (br.readLine()).split(" ");

        int result = 0;
        int count = 1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("1")) {
                result += count;
                count++;
            } else {
                count = 1;
            }
        }
        System.out.println(result);

    }
}
