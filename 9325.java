import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 9325
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i =0; i < n; i++){
            int car_price = Integer.parseInt(br.readLine());
            int options = Integer.parseInt(br.readLine());
            int result=0;
            for(int j=0; j<options; j++){
                String[] option = (br.readLine()).split(" ");
                result+=(Integer.parseInt(option[0])*Integer.parseInt(option[1]));
            }
            result+=car_price;
            System.out.println(result);
        }

    }
}
