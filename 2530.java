import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 2530
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = (br.readLine()).split(" ");

        int hour = Integer.parseInt(input[0]);
        int min = Integer.parseInt(input[1]);
        int sec = Integer.parseInt(input[2]);
        int needed = Integer.parseInt(br.readLine());

        min += needed / 60;
        sec += needed % 60;

        min += sec / 60;
        sec = sec % 60;

        hour += min / 60;
        min = min % 60;

        hour = hour % 24;

        System.out.println(hour + " " + min + " " + sec);

    }
}
