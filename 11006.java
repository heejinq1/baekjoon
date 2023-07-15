import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 11006
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i =0; i< t; i++){
            String[] list = (br.readLine()).split(" ");
            int legs = Integer.parseInt(list[0]);
            int chickens = Integer.parseInt(list[1]);
            System.out.println((chickens*2)-legs +" "+ (chickens-((chickens*2)-legs)));
        }
    }
}
