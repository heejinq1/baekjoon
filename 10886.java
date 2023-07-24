import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 10886

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
        int n= Integer.parseInt(br.readLine());
		int zeros = 0;
		int ones = 0;
		for(int i = 0; i <n; i++){
			String input = br.readLine();
			if(input.equals("1")){
				ones++;
			}
			else{
				zeros++;
			}
		}
		if(zeros>ones){
			System.out.println("Junhee is not cute!");
		}
		else{
			System.out.println("Junhee is cute!");
		}
    }
	
}
