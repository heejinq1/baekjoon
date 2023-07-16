import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 1546
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] grades = new int[n];
        for(int i=0; i < grades.length; i++){
            grades[i] = sc.nextInt();
        }
        double max= grades[0];
        double sum = grades[0];
        for(int i =1; i<grades.length; i++){
            if(grades[i]>max){
                max =grades[i];
            }
            sum+=grades[i];
        }
        max = max*n;
        double result = (sum/max)*100;
        System.out.println(result);

    }
}
