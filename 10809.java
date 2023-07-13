import java.io.*;
import java.util.StringTokenizer;

public class Main {

    // 10809
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = br.readLine();
        int[] alpha = new int[26];
        for(int j=0; j < alpha.length; j++){
            alpha[j]=-1;
        }
        for(int i =0; i <word.length(); i++){
            char temp = word.charAt(i);
            if(alpha[temp-97]==-1)
            alpha[temp-97]=i;
        }
        for(int k = 0; k < alpha.length; k++){
            System.out.print(alpha[k]+" ");
        }
	}
}
