import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // 2953

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
        String[] first = br.readLine().split(" ");
		String[] second = br.readLine().split(" ");
		String[] third = br.readLine().split(" ");
		String[] fourth = br.readLine().split(" ");
		String[] fifth = br.readLine().split(" ");
		int[] score = new int[5];
		for(int a = 0; a<first.length; a++){
			score[0]+=Integer.parseInt(first[a]);
		}
		for(int a = 0; a<first.length; a++){
			score[1]+=Integer.parseInt(second[a]);
		}
		for(int a = 0; a<first.length; a++){
			score[2]+=Integer.parseInt(third[a]);
		}
		for(int a = 0; a<first.length; a++){
			score[3]+=Integer.parseInt(fourth[a]);
		}
		for(int a = 0; a<first.length; a++){
			score[4]+=Integer.parseInt(fifth[a]);
		}

		int max = -1;
		int index = -1;
		for(int i =0; i < score.length; i++){
			if(score[i]>max){
				max = score[i];
				index = i;
			}
		}
		System.out.println((++index) +" "+ max);
    }
	
}
