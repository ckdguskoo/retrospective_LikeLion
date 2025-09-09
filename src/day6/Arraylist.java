package day6;

import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {

        //크기가 5인 정수형 배열을 만들고, 1부터 5까지 값을 순서대로 넣어보세요.
        //그리고 배열의 첫 번째 인덱스의 값과 마지막 인덱스의 값을 출력해 주세요.

        int[] index = {1,2,3,4,5};
        System.out.println(index[0]);
        System.out.println(index[index.length-1]);


     //이미 값이 있는 String 배열에서 값을 읽어와 출력해보세요.
        //**(for문을 사용해 주세요.)*

        String[] fruits = {"사과", "바나나", "오렌지"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }


        //[문제 설명]
        //배열의 특정 위치의 값을 변경해보세요.
        //
        //배열의 인덱스 1의 값 80을 20으로 변경,
        //배열의 마지막 인덱스의 값 85를 35로 변경해 주세요.
        //for문을 사용하여 배열의 값을 출력해 주세요.

        int[] scores = {70, 80, 90, 100, 87, 12, 32, 55, 32, 22, 12, 33, 85};
        scores[1] = 20;
        scores[scores.length-1] = 35;
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }


        //10개의 정수를 담을 수 있는 정수 배열에 1부터 10까지의 값을 초기화해 주세요.
        //그리고 이 배열의 모든 값을 더해주세요.

        int result= 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println("합계 : "+ result);


        //아래 배열의 첫 번째 값과 마지막 값의 위치를 바꿔보세요.

        int[] numbers = {22, 33, 44, 55, 66};
        int index0 = 0;
        int indexLats = 0;

        index0 = numbers[0];
        indexLats = numbers[numbers.length - 1];

        numbers[0] = indexLats;
        numbers[numbers.length - 1] = index0;

        System.out.println(Arrays.toString(numbers));
    }
}
