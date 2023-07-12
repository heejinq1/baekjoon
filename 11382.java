import java.io.*;

public class Main{

        //11382

        public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String[] temp = (br.readLine()).split(" ");
        System.out.println(Long.parseLong(temp[0])+Long.parseLong(temp[1])+Long.parseLong(temp[2]));
	}
}
