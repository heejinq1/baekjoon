import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 10569
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i =0; i< t; i++){
            String[] list = (br.readLine()).split(" ");
            int v = Integer.parseInt(list[0]);
            int e = Integer.parseInt(list[1]);
            System.out.println(2-v+e);
        }
    }
}
