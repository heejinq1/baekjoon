import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // 2738
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int n= Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
        int m = Integer.parseInt(temp.substring(temp.indexOf(" ")+1));
        int[][] list= new int[n][m];
        for(int i = 0; i < n; i++){
           String[] t = (br.readLine()).split(" ") ;
           for(int j =0; j<m; j++){
            int a = Integer.parseInt(t[j]);
            list[i][j]=a;
           }
        }
        for(int i = 0; i < n; i++){
           String[] t = (br.readLine()).split(" ") ;
           for(int j =0; j<m; j++){
            int a = Integer.parseInt(t[j]);
            list[i][j]+=a;
           }
        }
        for(int i =0; i< n; i++){
            for(int j=0; j<m; j++){
                System.out.print(list[i][j]+" ");
            }
            System.out.println();
        }

    }
}
