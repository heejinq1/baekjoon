import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 3003
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int[] chess= new int[6];
        for(int i =0; i < 6; i++){
            chess[i]= sc.nextInt();
        }
        int[] original = {1,1,2,2,2,8};
        for(int j = 0; j< chess.length; j++){
            System.out.print(original[j]-chess[j]);
            System.out.print(" ");
        }
    }
}
