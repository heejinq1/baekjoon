import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 2566
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] list = new int[9][9];
        for (int i = 0; i < 9; i++) {
            String[] t = (br.readLine()).split(" ");
            for (int j = 0; j < 9; j++) {
                int a = Integer.parseInt(t[j]);
                list[i][j] = a;
            }
        }
        int max = 0;
        int row = 0;
        int column = 0;
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                if (list[i][j] >= max) {
                    max = list[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        row++;
        column++;
        System.out.println(max);
        System.out.println(row + " " + column);

    }
}
