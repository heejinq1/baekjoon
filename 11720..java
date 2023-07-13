import java.io.*;
import java.util.StringTokenizer;

public class Main {

    // 11720
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String noneed = br.readLine();
		String temp = br.readLine();
        int result =0;
        for(int i=0; i < temp.length(); i++){
            result+=Integer.parseInt(Character.toString(temp.charAt(i)));
        }
        System.out.println(result);
	}
}
