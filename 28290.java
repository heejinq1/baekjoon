import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 28290
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        String word = sc.nextLine();
        switch(word){
            case "fdsajkl;":
            case "jkl;fdsa": System.out.println("in-out");break;
            case "asdf;lkj":
            case ";lkjasdf": System.out.println("out-in");break;
            case "asdfjkl;": System.out.println("stairs"); break;
            case ";lkjfdsa": System.out.println("reverse"); break;
            default: System.out.println("molu"); break;
        }
	}
}
