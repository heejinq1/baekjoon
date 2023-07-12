import java.io.*;
import java.util.StringTokenizer;

public class Main {

    // 10818
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		br.close();
		int [] arr = new int[n];
		int i = 0;
		while(st.hasMoreTokens()) {
			arr[i]= Integer.parseInt(st.nextToken());
			i++;
		}

		int min = arr[0];
		int max = arr[0];
		for(int k = 0; k < arr.length ; k++) {
			if(arr[k]< min) {
				min = arr[k];
			}
			else {
				if(arr[k]>max) {
					max = arr[k];
				}
			}
			
			
		}
		System.out.println(min + " " + max);
	}
}
