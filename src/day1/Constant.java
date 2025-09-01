package day1;

public class Constant {
    public static void main(String[] args) {
        //final 키워드를 사용해 정수형 상수를 선언하고 초기화한 뒤 출력해 보세요.
        final int num = 3;

        //상수를 선언한 뒤, 값을 변경하려고 시도하면 오류가 발생합니다. 아래 예시 코드에서 NUMBER = 200; 의 주석을 해제한 후 오류를 확인해 보세요.
        final int NUMBER = 100;

        // 아래 줄에서 상수를 변경하려고 하면 오류 발생
        // NUMBER = 200; 상수라 변경 X

        System.out.println("상수 값: " + NUMBER);

        //final 키워드를 사용해 문자열 상수를 선언하고, 메시지를 출력하세요.
        final String adminId = "admin";
        System.out.println(adminId);

        //두 정수형 상수를 선언하고, 두 상수의 합을 계산하여 출력해 보세요.
        final int num2 = 5;
        final int num3 = 15;
        System.out.println(num2+num3);

        //다양한 기본형 타입(int, double, char, boolean)의 상수를 선언하고 출력하세요.
        final int number = 10;
        final double PI = 3.14159265358979;
        final char d = 'D';
        final boolean bol = true;

        System.out.println(number);
        System.out.println(PI);
        System.out.println(d);
        System.out.println(bol);



    }
}
