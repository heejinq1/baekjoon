import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    // 1247

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++){
            int t = sc.nextInt();
            BigInteger sum = new BigInteger("0");
            for(int j =0; j<t; j++){
                sum = sum.add(sc.nextBigInteger());
            }
            int result = sum.compareTo(new BigInteger("0"));
            if(result == 0){
                System.out.println("0");
            }
            else if(result == -1){
                System.out.println("-");
            }
            else{
                System.out.println("+");
            }
        }
	}
}
