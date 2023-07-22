import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    // 2445

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
        String star = "*";
        String space = "";
        for(int j =0; j < i-1; j++){
            space+=" ";

        }
        for(int k =0; k < i-1; k++){
            System.out.println(star+space+space+star);
            space=space.substring(1);
            star+="*";
        }
        System.out.println(star+star);
        for(int l = 0; l<i-1; l++){
            star=star.substring(1);
            space+=" ";
            System.out.println(star+space+space+star);
        }
	}
}
