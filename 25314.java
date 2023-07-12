import java.io.*;

public class Main {

    // 25314
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String result="";
        for (int i = 1; i <= n/4; i++) {
            result+="long ";
        }
        System.out.println(result+"int");
    }
}
