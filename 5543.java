import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    // 5543
    public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int b1= sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int set1 = (b1+d1)<= (b1+d2)?  (b1+d1) :(b1+d2);
        set1-=50;
        int set2 = (b2+d1)<= (b2+d2)?  (b2+d1) :(b2+d2);
        set2-=50;
        int set3 = (b3+d1)<= (b3+d2)?  (b3+d1) :(b3+d2);
        set3-=50;
        if(set1<=set2 && set1<=set3){
            System.out.println(set1);
        }
        else if(set2<=set1 && set2<=set3){
            System.out.println(set2);
        }
        else{
            System.out.println(set3);
        }


	}
}
