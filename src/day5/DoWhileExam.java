package day5;

import java.util.Scanner;

public class DoWhileExam {
    public static void main(String[] args) {
        //사용자가 0을 입력할 때까지 계속해서 메뉴를 보여주는 프로그램입니다.
        Scanner scanner = new Scanner(System.in);
        int choseNumber;
        do {
            System.out.println("=== 메뉴 ===");
            System.out.println("1. 아메리카노");
            System.out.println("2. 카페라떼");
            System.out.println("3. 녹차");
            System.out.println("0. 종료");
            System.out.println("선택 : ");
            choseNumber = scanner.nextInt();
            if (choseNumber == 0) {
                break;
            }
            System.out.println("선택하신 메뉴는 "+ choseNumber+"번 입니다");

        }while (choseNumber != 0);
        System.out.println("프로그램을 종료합니다.");


        //"안녕하세요"를 3번 출력하는 프로그램입니다.
        //”안녕하세요”를 3번 모두 출력하면 “안녕하세요 3번을 모두 출력했습니다.
        //출력하는 프로그램을 만들어주세요.
        int i = 1;
        do {
            System.out.println(i+"번째 안녕하세요");
            i++;
        }while (i<=3);
        System.out.println("안녕하세요 3번을 모두 출력했습니다!");


        //int num = 10을 증감식을 사용하여 1씩 감소시켜 5보다 크거나 같을 때까지 반복해서 num 변수를
        //출력하는 프로그램을 만들어 주세요.
        int num =10;
        do {
            System.out.println(num);
            num--;
        }while (num>4);

    }
}
