import java.util.Scanner; //Scanner 클래스 import 하기.
import java.util.Arrays; //Array 클래스 import 하기

public class Main {

    // 3052

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체 생성.

        int[] numbers = new int[10]; //initializing int array with size =10;
        for (int i = 0; i < 10; i++) { //입력 받음과 동시에 입력%42 array에 저장.
            numbers[i] = (sc.nextInt()) % 42;
        }
        Arrays.sort(numbers); //오름차순으로 정렬.
        int count = 1; //같은 나머지값이 몇개인지 저장할 variable.
        int previous = numbers[0]; //array에서 첫번째 element 저장.
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] != previous) { //만약 현재 element와 그 전 element가 다를경우 count++
                count++;
                previous = numbers[j];
            }
        }
        System.out.println(count); //다른 나머지값의 갯수 출력
    }
}
