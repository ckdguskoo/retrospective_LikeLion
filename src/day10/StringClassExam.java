package day10;

public class StringClassExam {
    public static void main(String[] args) {
        //문자열의 길이를 반환하는 프로그램을 작성하세요.
        //
        //문자열: Hello, World!
        //
        //[실행 결과] 13

        String hello = "Hello, World!";
        System.out.println(hello.length());

        //주어진 문자열에서 특정 부분을 추출하여 출력하세요.
        //
        //문자열: Start Java.
        //
        //[실행 결과] Java.

        String java = "Start Java.";
        System.out.println(java.substring(6));

        //문자열을 모두 대문자와 소문자로 변환하여 출력해 보세요.
        //
        //문자열: Hello Java Study
        //
        //[실행 결과]
        //
        //HELLO JAVA STUDY hello java study

        String hello2 = "Hello Java Study";
        System.out.println(hello2.toLowerCase());
        System.out.println(hello2.toUpperCase());

        //두 문자열이 같은지 2개의 메소드를 사용하여 비교해 보세요.
        //
        //String str1 = "lion";
        //
        //String str2 = "Lion";
        //
        //사용 메소드 : equals(), equalsIgnoreCase()
        //
        //[실행 결과]
        //
        //false true

        String str1 = "lion";
        String str2 = "Lion";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));


        //concat() 메소드를 활용하여 두 문자열을 하나로 연결해 보세요.
        //
        //String text1 = "winter는 ";
        //
        //String text2 = "pizza를 좋아합니다.";
        //
        //[실행 결과]
        //
        //winter는 pizza를 좋아합니다.

        String text1 = "winter는 ";
        String text2 = "pizza를 좋아합니다.";

        System.out.println(text1.concat(text2));
    }
}
