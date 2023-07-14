import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 2752
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c = sc.nextInt();

        if(a<b && a<c){
            if(b<c){
                System.out.print(a+" "+ b+" "+c);
            }
            else
                System.out.print(a+" "+ c+" "+b);
        }
        else if(b<c && b<c){
            if(a<c){
                System.out.print(b+" "+ a+" "+c);
            }
            else
                System.out.print(b+" "+ c+" "+a);
        }
        else{
            if(a<b){
                System.out.print(c+" "+ a+" "+b);
            }
            else   
                System.out.print(c+" "+ b+" "+a);
        }
	}
}
