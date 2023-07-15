import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 9085
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i =0; i< t; i++){
            String temp = br.readLine();
            String[] list = (br.readLine()).split(" ");
            int result=0;
            for(int k = 0; k < list.length; k++){
                result+= Integer.parseInt(list[k]);
            }
            System.out.println(result);
        }
    }
}
