import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

	// 1100

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] chess = new String[8];
        for(int i =0; i<8; i++){
            chess[i] = in.readLine();
        }
        int count = 0;

        for(int j =0; j<chess.length; j++){
            if(j%2==0){
                for(int k=0; k< chess[j].length(); k+=2){
                    if(chess[j].charAt(k) == 'F')
                    count++;
                }
            }
            else{
                for(int k = 1; k<chess[j].length(); k+=2){
                    if(chess[j].charAt(k) == 'F'){
                        count++;
                    }
                }
            }
        }
        
        System.out.println(count);
	}

}
