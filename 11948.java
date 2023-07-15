import java.io.*;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    // 11948
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int min = a1;
        int[] list = {a1, a2,a3,a4};
        for(int i =1;i<list.length;i++){
            if(list[i]<=min){
                min = list[i];
            }
        }
        int min2= b1<=b2? b1:b2;
        System.out.println(a1+a2+a3+a4+b1+b2-min-min2);
        
        

    }
}
