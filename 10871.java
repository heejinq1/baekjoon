import java.io.*;
//import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class Main {

    // 10871
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		int num = Integer.parseInt(st.nextToken());
		int compare = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			if (temp < compare) {
				bw.write(temp + " ");
			}
		}

		br.close();
		
		bw.flush();
		bw.close();

	}
}
