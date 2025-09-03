package day3;

import java.util.Scanner;

public class IFExam {
    public static void main(String[] args) {
//        사용자로부터 하나의 정수를 입력받아
//
//         - 양수인 경우 "양수입니다"
//         - 음수인 경우 "음수입니다"
//         - 0인 경우 "0입니다"
//         를 출력하는 프로그램을 작성하세요.
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if(a>0){
            System.out.println("양수입니다.");
        }
        else if (a<0){
            System.out.println("음수입니다.");
        }
        else {
            System.out.println("0입니다");
        }

        //학생의 시험 점수를 입력받아 학점을 출력하는 프로그램을 작성하세요.
        //
        //- 90점 이상: "A"
        //- 80점 이상 90점 미만: "B"
        //- 70점 이상 80점 미만: "C"
        //- 70점 미만: "F"

        int score = scanner.nextInt();
        if(score>=90){
            System.out.println("A");
        }
        else if(score>=80){
            System.out.println("B");
        }
        else if(score>=70){
            System.out.println("C");
        }
        else if(score<70){
            System.out.println("F");
        }


        //월을 나타내는 숫자(1~12)를 입력받아 해당하는 계절을 출력하는 프로그램을 작성하세요.
        //
        //- 3~5월: "봄"
        //- 6~8월: "여름"
        //- 9~11월: "가을"
        //- 12, 1, 2월: "겨울"

        int month = scanner.nextInt();
        if (month >=1 && month <= 2){
            System.out.println("겨울");
        }
        else if (month >=3 && month <=5){
            System.out.println("봄");
        }
        else if (month >=6 && month <=8){
            System.out.println("여름");
        }
        else if (month >=9 && month <=11){
            System.out.println("가을");
        }
        else if (month ==12 ){
            System.out.println("겨울");
        }

        //나이를 입력받아 입장료를 계산하는 프로그램을 작성하세요.
        //
        //기본 입장료:
        //
        //- 3세 미만: 무료
        //- 3세 이상 ~ 13세 미만: 5000원
        //- 13세 이상 ~ 65세 미만: 10000원
        //- 65세 이상: 6000원

        int age = scanner.nextInt();
        if (age < 3){
            System.out.println("입장료 : 무료" );
        }
        else  if (age < 13){
            System.out.println("입장료 : 5000원");
        }
        else if (age < 65) {
            System.out.println("입장료 : 10000원");
        }
        else if (age >= 65) {
            System.out.println("입장료 : 6000원");
        }
    }

}
