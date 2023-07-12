import java.io.*;

public class Main {

    // 2884

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = (br.readLine()).split(" ");
        int hour = Integer.parseInt(temp[0]);
        int minute = Integer.parseInt(temp[1]);

        if(minute>=45){
            System.out.println(hour+" "+ (minute-45));
        }
        else{
            if(hour!=0){
                System.out.println((hour-1)+" " +(minute+60-45));
            }
            else{
                hour=23;
                System.out.println(hour+" " + (minute+60-45));
            }
        }
    }
}
