import java.io.*;
import java.util.StringTokenizer;

public class Main {
  // 11022
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < num ; i++) {
			st = new StringTokenizer(br.readLine() , " ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2= Integer.parseInt(st.nextToken());
			bw.write("Case #"+ (i+1) + ": "+num1+ " + " +num2+" = " +(num1+num2)+ "\n" );
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
