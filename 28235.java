import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 28235
	public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        switch(code){
            case "SONGDO": System.out.println("HIGHSCHOOL");break;
            case "CODE": System.out.println("MASTER");break;
            case "2023": System.out.println("0611"); break;
            case "ALGORITHM": System.out.println("CONTEST");break;
        }
        
	}
}
