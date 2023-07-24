import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 2920

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
        
		String[] list = br.readLine().split(" ");
		int count = 1;
		boolean ascending = true;
		for(int i = 0; i<list.length; i++){
			if(Integer.parseInt(list[i])!=count){
				ascending = false;
				break;
			}
			count++;
		}
		if(ascending == true){
			System.out.println("ascending");
		}
		else{
			count = 8;
			boolean descending = true;
			for(int j =0; j< list.length; j++){
				if(Integer.parseInt(list[j])!=count){
					descending = false;
					break;
				}
				count--;
			}
			if(descending== true){
				System.out.println("descending");
			}
			else{
				System.out.println("mixed");
			}
		}
    }
}
