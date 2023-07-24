import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 15953

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
		for(int i =0; i < n ; i++){
			String[] input = br.readLine().split(" ");
			int first= Integer.parseInt(input[0]);
			int second = Integer.parseInt(input[1]);
			int prize = 0;
			if(first == 1){
				prize+=5000000;
			}
			else if(first == 2 || first == 3 ){
				prize += 3000000;
			}
			else if(first >=4 && first <= 6){
				prize+= 2000000;
			}
			else if(first>=7 && first <=10){
				prize+=500000;
			}
			else if(first>=11 && first<=15){
				prize+=300000;
			}
			else if(first>=16 && first <=21){
				prize+=100000;
			}
			else{
				prize+=0;
			}
			if(second == 1){
				prize +=5120000;
			}
			else if(second ==2 || second == 3){
				prize+=2560000;
			}
			else if(second>=4 && second<=7){
				prize+=1280000;
			}
			else if(second >= 8 && second <=15){
				prize += 640000;
			}
			else if(second>=16 && second <=31){
				prize +=320000;
			}
			else{
				prize+=0;
			}
			sb.append(Integer.toString(prize)).append("\n");
		}
		System.out.println(sb);
    }
	
}
