import java.io.*;
//import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class Main {

    // 10807
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String v = br.readLine();
        int result =0;
        while(st.hasMoreTokens()){
            if(st.nextToken().equals(v)){
                result++;
            }
        }
		
		System.out.println(result);
		
	}
}
