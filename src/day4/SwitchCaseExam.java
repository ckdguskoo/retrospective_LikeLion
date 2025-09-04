package day4;

import java.util.Scanner;

public class SwitchCaseExam {
    public static void main(String[] args) {
        //숫자 1~7을 입력받아 해당하는 요일을 출력하는 프로그램을 만드세요.
        //1=월요일, 2=화요일, ... 7=일요일
        Scanner sc = new Scanner(System.in);
        System.out.println("1~7까지의 숫자중 하나를 입력해주세요");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> System.out.println("월요일");
            case 2 -> System.out.println("화요일");
            case 3 -> System.out.println("수요일");
            case 4 -> System.out.println("목요일");
            case 5 -> System.out.println("금요일");
            case 6 -> System.out.println("토요일");
            case 7 -> System.out.println("일요일");
        }


        //학년을 입력하면 교실 번호가 출력됩니다.
        //1학년 = 101호
        //2학년 = 102호
        //3학년 = 103호
        //[출력 예시]
        //2 입력 시 ‘102호’ 출력

        System.out.println("학년을 입력하면 교실 번호가 출력됩니다");
        int classroom = sc.nextInt();
        switch (classroom) {
            case 1 -> System.out.println("101호");
            case 2 -> System.out.println("102호");
            case 3 -> System.out.println("103호");
        }


        //한글 과일 이름을 입력하면 영어로 변환되어 출력됩니다.
        //"사과" = "apple"
        //"바나나" = "banana"
        //"오렌지" = "orange"
        //
        //[입력과 출력 예시]
        //fruit = "사과" → "apple"
        //fruit = "바나나" → "banana"
        //fruit = "오렌지" → "orange"

        System.out.println("영어로 변환하실 과일을 입력해주세요");
        String a = "Apple";
        String b = "Banana";
        String o = "Orange";

        String fruit = sc.nextLine();
        switch (fruit) {
            case "사과" -> System.out.println(a);
            case "바나나" -> System.out.println(b);
            case "오렌지" -> System.out.println(o);
        }


        //영어 색깔 이름을 입력하면 한글로 변환되어 출력됩니다.
        //"red" = "빨간색"
        //"blue" = "파란색"
        //"green" = "초록색"
        //
        //[입력과 출력 예시]
        //color = "red" → "빨간색"
        //color = "blue" → "파란색"
        //color = "green" → "초록색"

        System.out.println("한국로 변환할 영어 색깔을 입력해주세요");
        String color = sc.next();
        switch (color) {
            case "red" -> System.out.println("빨간색");
            case "blue" -> System.out.println("파랑색");
            case "green" -> System.out.println("초록색");
        }


        //음료 번호를 입력하면 가격이 출력됩니다.
        //1 = 아메리카노 (2000원)
        //2 = 카페라떼 (2500원)
        //3 = 초코라떼 (3000원)
        //4 = 바닐라라떼 (3000원)

        System.out.println("음료 번호를 입력하시면 가격이 출력됩니다");
        int orderNum = sc.nextInt();
        switch (orderNum) {
            case 1 -> System.out.println("선택하신 음료 아메리카노는 2000원 입니다.");
            case 2 -> System.out.println("선택하신 음료 카페라떼는 2500원 입니다.");
            case 3 -> System.out.println("선택하신 음료 초코라떼는 3000원 입니다.");
            case 4 -> System.out.println("선택하신 음료 바닐라라떼는 3000원 입니다.");
        }






    }
}
