import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    // 2523

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
        String star = "*";
        String space = "";
        for(int j = 0; j<i-1 ; j++){
            space+=" ";
        }
        for(int j = 0; j< i-1; j++){
            System.out.println(star);
            star+="*";
            space=space.substring(1);
        }
        System.out.println(star);
        for(int k=0; k<i-1; k++){
            star=star.substring(1);
            space+=" ";
            System.out.println(star);
        }
	}
}
