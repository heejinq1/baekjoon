import java.util.Scanner; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    // 24883

    public static void main(String[] args) throws IOException{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        String n = sc.nextLine();
        if(n.equals("n") || n.equals("N")){
            System.out.println("Naver D2");
        }
        else{
            System.out.println("Naver Whale");
        }
    }
}
