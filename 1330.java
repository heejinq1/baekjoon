import java.io.*;

public class Main{

        //1330

        public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String[] temp = (br.readLine()).split(" ");
        if(Integer.parseInt(temp[0])== Integer.parseInt(temp[1]))
        System.out.println("==");
        else if(Integer.parseInt(temp[0])>Integer.parseInt(temp[1]))
        System.out.println(">");
        else
        System.out.println("<");
    }
}
