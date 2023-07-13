import java.io.*;
import java.util.StringTokenizer;

public class Main {

    // 27866
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
        int i = Integer.parseInt(br.readLine())-1;
        System.out.println(word.charAt(i));
	}
}
