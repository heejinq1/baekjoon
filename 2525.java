import java.io.*;

public class Main {

    // 2525

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = (br.readLine()).split(" ");
        int cooking = Integer.parseInt(br.readLine());
        int hour = Integer.parseInt(temp[0]);
        int minute = Integer.parseInt(temp[1]);

        minute = cooking + minute;

        if(minute <60){
            System.out.println(hour +" "+ minute);
        }
        else{
            hour = hour + (minute / 60);
            minute = minute % 60;
            if(hour>23){
                System.out.println((hour%24)+ " " + minute);
            }
            else
                System.out.println(hour+ " " + minute);
        }
    }
}
