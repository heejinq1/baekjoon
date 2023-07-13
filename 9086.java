import java.io.*;
import java.util.StringTokenizer;

public class Main {

    // 9086
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
        for(int i =0; i < t; i++){
            String word = br.readLine();
            System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
        }
	}
}
