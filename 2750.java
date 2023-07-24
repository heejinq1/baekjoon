import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 2750

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());
		int[] list= new int[N];
		for(int i = 0; i< N; i++){
			list[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(list);
		for(int j =0; j<N; j++){
			sb.append(list[j]).append("\n");
		}

		System.out.println(sb);
    }
}
