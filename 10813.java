import java.io.*;
import java.util.StringTokenizer;

public class Main {

    // 10813
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm= br.readLine(); // N M
        int size = Integer.parseInt(nm.substring(0, nm.indexOf(" "))); // N
        String[] basket = new String[size];
        for(int i =0; i < basket.length; i++){  //Initializing basket
            basket[i] = Integer.toString(i+1); 
        }
        for(int j = 0; j < Integer.parseInt(nm.substring(nm.indexOf(" ")+1)); j++){
            String ij = br.readLine();
            int first = Integer.parseInt(ij.substring(0, ij.indexOf(" ")))-1; //index of i
            int second = Integer.parseInt(ij.substring(ij.indexOf(" ")+1))-1; //index of j
            String temp = basket[first]; //content of i
            basket[first] = basket[second];
            basket[second] = temp;
        }

        for(int k = 0; k< basket.length; k++){
            System.out.print(basket[k]+" ");
        }
	}
}
