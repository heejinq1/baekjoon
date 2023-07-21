import java.util.Scanner; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {

    // 1267

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int Y = 0;
        int M =0;
        for(int i =0; i<t; i++){
            int sec = sc.nextInt();
            Y += ((sec/30)+1) * 10;
            M += ((sec/60)+1) * 15;
        }
        if(Y<M){
            System.out.println("Y "+Y);
        }
        else if (M<Y){
            System.out.println("M "+ M);
        }
        else{
            System.out.println("Y M "+ M);
        }
        
        
    }

    
}
v
