import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 13866

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int[] team = new int[4];
		for(int i =0; i< 4; i++){
			team[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(team);
		int result = (team[0]+team[3])- (team[1]+team[2]);
		if(result<0){
			result*=-1;
		}
		System.out.println(result);
		

        
    }
	
}
