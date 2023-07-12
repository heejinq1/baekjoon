import java.io.*;
//import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class Main {

    // 10810
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
        int size = Integer.parseInt(input.substring(0, input.indexOf(" ")));
        String[] basket = new String[size];
        for(int a = 0 ; a < Integer.parseInt(input.substring(input.indexOf(" ")+1)); a++){
            String[] temp = (br.readLine()).split(" ");
            for(int b = Integer.parseInt(temp[0])-1; b<= Integer.parseInt(temp[1])-1; b++){
                basket[b] = temp[2];
            }
            

        }

        for(int i =0; i< basket.length; i++){
            if(basket[i]!=null)
                System.out.print(basket[i]+" ");
            else
                System.out.print("0 ");
        }
	}
}
