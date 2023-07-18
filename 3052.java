import java.util.Scanner; //Scanner 클래스 import 하기.
import java.util.Arrays;

public class Main {

    // 3052

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체 생성.

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (sc.nextInt()) % 42;
        }
        Arrays.sort(numbers);
        int count = 1;
        int previous = numbers[0];
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] != previous) {
                count++;
                previous = numbers[j];
            }
        }
        System.out.println(count);
    }
}
