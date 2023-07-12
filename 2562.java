import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    // 2562
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[9];
		for(int i = 0 ; i < 9 ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int pos = 0;
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				pos =i;
			}
		}
		System.out.println(max);
		System.out.println(pos+1);
	}
}
