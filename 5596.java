import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

    // 5596
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] min = (br.readLine()).split(" ");
        String[] man = (br.readLine()).split(" ");
        int min_score = Integer.parseInt(min[0])+Integer.parseInt(min[1])+Integer.parseInt(min[2])+Integer.parseInt(min[3]);
        int man_score = Integer.parseInt(man[0])+Integer.parseInt(man[1])+Integer.parseInt(man[2])+Integer.parseInt(man[3]);
        if(min_score>=man_score){
            System.out.println(min_score);
        }
        else
            System.out.println(man_score);
	}
}
