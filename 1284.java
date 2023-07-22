import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    // 1284

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
        while(!input.equals("0")){
            int sum=1;
            for(int i =0; i<input.length(); i++){
                char a = input.charAt(i);
                if(a == '1'){
                    sum+=2;
                }
                else if(a =='0'){
                    sum+=4;
                }
                else{
                    sum+=3;
                }
                sum++;
            }
            System.out.println(sum);
            input = sc.nextLine();
        }
	}
}
