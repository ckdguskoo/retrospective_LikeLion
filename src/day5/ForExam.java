package day5;

public class ForExam {
    public static void main(String[] args) {
        //1부터 100까지 출력하는 프로그램을 작성해보세요.
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }


        //80부터 50까지 거꾸로 출력하는 프로그램을 작성해보세요.
        for (int i = 80; i >=50 ; i--){
            System.out.println(i);
        }


        //1부터 10까지 출력하되, 5가 되면 멈추는 프로그램을 작성해보세요.
        for (int i = 1; i < 10; i++) {
            if (i ==5){
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }


        //2부터 10까지의 짝수를 출력하는 프로그램을 작성해보세요.
        for (int i = 2; i <=10 ; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }



        //3단 구구단을 출력하는 프로그램을 작성해보세요.
        final int x = 3;
        for (int i = 1; i <=9 ; i++) {
            System.out.println(x*i);
        }



        //20부터 25까지 출력하되, 23은 건너뛰는 프로그램을 작성해보세요.
        for (int i = 20; i <=25 ; i++) {
            if (i == 23){
                continue;
            }
            System.out.println(i);
        }


    }
}
