import java.io.*;

public class Main {

    // 2480

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = (br.readLine()).split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);
        int c = Integer.parseInt(temp[2]);

        if(a==b && b==c){
            System.out.println(10000+a*1000);
        }
        else if(a==b || a==c){
            System.out.println(1000+a*100);
        }
        else if(b==c){
            System.out.println(1000+b*100);

        }
        else{

            if(a>b && a>c){
                System.out.println(a*100);
            }
            else if(b>a && b>c){
                System.out.println(b*100);
            }
            else{
                System.out.println(c*100);
            }
            
        }
    }
}
