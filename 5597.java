import java.io.*;
import java.util.StringTokenizer;

public class Main {

    // 5597
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] attendance = new String[30];
        for(int i = 0; i < 28; i++){
            int temp  = Integer.parseInt(br.readLine())-1;
            attendance[temp]="0";
        }
        for(int j = 0 ; j< attendance.length; j++){
            if(attendance[j]==null){
                System.out.println(j+1);
            }
        }
	}
}
