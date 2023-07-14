import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

    // 8958
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        int x =Integer.parseInt(br.readLine());
        int result = 0;
        int mark = 0;
        for(int i = 0; i < x; i++){
            String temp = br.readLine();
            for(int j =0; j< temp.length(); j++){
                if(temp.charAt(j)=='O'){
                    mark++;
                    result+=mark;
                    
                }
                else{
                    mark=0;
                }
            }
            
            System.out.println(result);
            result =0;
            mark =0;
        }

	}
}
