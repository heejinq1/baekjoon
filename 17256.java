import java.util.Scanner; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    // 17256

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = (br.readLine()).split(" ");
        String[] c = (br.readLine()).split(" ");
        int b_x = Integer.parseInt(c[0])- Integer.parseInt(a[2]);
        int b_y = Integer.parseInt(c[1])/Integer.parseInt(a[1]);
        int b_z = Integer.parseInt(c[2])-Integer.parseInt(a[0]);
        System.out.println(b_x+ " "+ b_y +" "+ b_z);
    }
}
