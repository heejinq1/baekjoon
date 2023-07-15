import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 11023
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = (br.readLine()).split(" ");
        int result =0;
        for(int i =0; i < numbers.length; i++){
            result+= (Integer.parseInt(numbers[i]));
        }
        System.out.println(result);

    }
}
