package day2;

public class comparisonOperator {
    public static void main(String[] args) {
        //두 정수형 변수를 선언하고, 두 수가 같은지 비교하여 결과를 출력하세요.
        int a = 10;
        int b = 20;
        boolean c = a == b;
        System.out.println(c);

        //두 정수형 변수를 선언하고,
        // 첫 번째 수가 두 번째 수보다 큰지 비교하여 결과를 출력하세요.
        int a1 = 25;
        int b2 = 18;
        boolean c2 = a1>b2;
        System.out.println(c2);

        //두 정수형 변수를 선언하고,
        //첫 번째 수가 두 번째 수보다 작은지 비교하여 결과를 출력하세요.
        int a3 = 12;
        int b3 = 30;
        System.out.println(a3<b3);

        //두 문자열 변수를 선언하고,
        // 문자열이 같은지 비교하여 결과를 출력하세요.
        // (equals 메서드를 사용해야 합니다.)
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1.equals(str2));

        //두 정수형 변수를 선언하고,
        // 첫 번째 수가 두 번째 수와 같거나 작은지 비교하여 결과를 출력하세요.
        int a4 = 8;
        int b4 = 20;
        System.out.println(a4==b4 || a4<b4);





    }
}
