import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 26933
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cost = 0;
        for (int i = 0; i < n; i++) {
            String[] line = (br.readLine()).split(" ");

            int h = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int k = Integer.parseInt(line[2]);
            if (h < b) {
                cost += ((b - h) * k);
            }

        }
        System.out.println(cost);
    }
}
