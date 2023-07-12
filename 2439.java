import java.io.*;
//import java.util.StringTokenizer;

public class Main {

    //2439
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		//StringTokenizer st;
		int count = num-1;
		for(int i = num; i > 0 ; i--) {
			for(int j = i-1; j >0 ; j--) {
				bw.write(" ");
			}
			for(int k = num-count; k >0; k--) {
				bw.write("*");
			}
			count--;
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
