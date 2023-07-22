import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    // 2446

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
        String star = "";
        String space = "";
        for(int j = 0; j<i-1 ; j++){
            star+="*";
        }
        for(int k=0; k<i-1; k++){
            System.out.println(space+star+"*"+star);
            space+=" ";
            star=star.substring(1);
        }
        System.out.println(space+"*");
        for(int l =0; l<i-1; l++){
            star+="*";
            space=space.substring(1);
            System.out.println(space+star+"*"+star);
        }
	}
}
