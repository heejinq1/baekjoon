import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 5086
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = (br.readLine()).split(" ");
        while (!temp[0].equals("0") && !temp[1].equals("0")) {
            int first = Integer.parseInt(temp[0]);
            int second = Integer.parseInt(temp[1]);

            if (first < second && second % first == 0) {
                System.out.println("factor");
            } else if (first > second && first % second == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");

            }
            temp = (br.readLine()).split(" ");
        }

    }
}
