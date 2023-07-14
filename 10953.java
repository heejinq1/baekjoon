import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 10953
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String temp = br.readLine();
            System.out.println(Integer.parseInt(temp.substring(0, temp.indexOf(",")))+Integer.parseInt(temp.substring(temp.indexOf(",")+1)));
        }

    }
}
