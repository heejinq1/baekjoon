import java.io.*;
//import java.util.StringTokenizer;

public class Main {

    // 2438
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		//StringTokenizer st;
		
		for(int i = 0; i < num ; i++) {
			for(int j = i+1; j >0 ; j--) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
