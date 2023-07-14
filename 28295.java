import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    // 28295
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        String direction = "N";
        for(int i =0; i< 10; i++){
            int temp = sc.nextInt();
            switch(temp){
                case 1: if(direction.equals("N")){
                            direction="E"; break;
                        }
            
                        else if(direction.equals("E")){
                            direction="S"; break;
                        }
                        else if(direction.equals("S")){
                            direction="W"; break;
                        }
                        else{
                            direction="N"; break;
                        }
                case 2: if(direction.equals("N")){
                            direction="S"; break;
                        }
            
                        else if(direction.equals("E")){
                            direction="W"; break;
                        }
                        else if(direction.equals("S")){
                            direction="N"; break;
                        }
                        else{
                            direction="E"; break;
                        }
                case 3: if(direction.equals("N")){
                            direction="W"; break;
                        }
            
                        else if(direction.equals("E")){
                            direction="N"; break;
                        }
                        else if(direction.equals("S")){
                            direction="E"; break;
                        }
                        else{
                            direction="S"; break;
                        }
            }
        }
        System.out.println(direction);
	}
}
