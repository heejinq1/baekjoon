import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 5565
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int total = sc.nextInt();
        for(int i =0; i<9; i++){
            total-=sc.nextInt();
        }
        System.out.println(total);
    }
}
