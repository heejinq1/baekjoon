import java.io.*;

public class Main {

    // 25304
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int result=0;
        for (int i = 1; i <= n; i++) {
            String[] temp = (br.readLine()).split(" ");
            result+= Integer.parseInt(temp[0])*Integer.parseInt(temp[1]);
        }
        if(result == total)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
