import java.util.Scanner; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {

    // 1076

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();
        String result="";
        switch(first){
            case "black": result+="0";break;
            case "brown": result+="1";break;
            case "red": result+="2";break;
            case "orange": result+="3";break;
            case "yellow": result+="4";break;
            case "green": result+="5";break;
            case "blue": result+="6";break;
            case "violet": result+="7";break;
            case "grey": result+="8";break;
            case "white": result+="9";break;
        }
        switch(second){
            case "black": result+="0";break;
            case "brown": result+="1";break;
            case "red": result+="2";break;
            case "orange": result+="3";break;
            case "yellow": result+="4";break;
            case "green": result+="5";break;
            case "blue": result+="6";break;
            case "violet": result+="7";break;
            case "grey": result+="8";break;
            case "white": result+="9";break;
        }
        switch(third){
            case "black": result+="";break;
            case "brown": result+="0";break;
            case "red": result+="00";break;
            case "orange": result+="000";break;
            case "yellow": result+="0000";break;
            case "green": result+="00000";break;
            case "blue": result+="000000";break;
            case "violet": result+="0000000";break;
            case "grey": result+="00000000";break;
            case "white": result+="000000000";break;
        }
        System.out.println(Long.parseLong(result));

        
    }

    
}
