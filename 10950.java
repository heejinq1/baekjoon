import java.io.*;

public class Main {

    // 10950
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] temp = (br.readLine()).split(" ");
            System.out.println(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]));
        }
    }
}
