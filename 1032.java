import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

	// 1032

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        String[] list = new String[n];
        for(int i = 0 ; i < n; i++){
            list[i] = in.readLine();
        }
        boolean different = false;

        String result = "";
        int count  = 0;
        while(count<list[0].length()){
            char temp = list[0].charAt(count);
            for(int j =1; j<n; j++){
                if(temp!= list[j].charAt(count)){
                    different = true;
                    break;
                }
            }
            if(different == true){
                result+="?";
            }
            else{
                result+=temp;
            }
            count++;
            different= false;
        }
		System.out.println(result);
	}

}
