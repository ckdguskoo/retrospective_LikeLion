package day5;

public class WhileExam {
    public static void main(String[] args) {
        //while문을 사용해서 1부터 5까지 숫자를 출력해보세요.
        int i =1;
        while(i<=5){
            System.out.println(i);
            i++;
        }


        //[문제 설명]
        //while문을 사용해서 구구단 3단을 출력해보세요.
        //
        //[참고 변수]
        int num = 1;
        int dan = 3;

        while (num<=9){
            System.out.println(dan*num);
            num++;

        }


        //int num 변수를 활용하여 1부터 10까지의 숫자 중 짝수만 출력해보세요.
//        int num = 1;
//        while (num <= 10) {
//            if (num % 2 == 0) {
//                System.out.println(num);
//            }
//            num++;
//        }


        //1부터 20까지의 숫자 중 3의 배수를 찾아 출력하고,
        //3의 배수가 나올 때마다 "찾았다!"를 출력하세요.
        //3의 배수가 아닌 경우, 숫자가 출력됩니다.

        num = 1;
        while (num <= 20) {
            if (num % 3 ==0){
                System.out.println(num+" (찾았다!)");

            }
            System.out.println(num);
            num++;
        }


        //1부터 10까지의 합계를 구해보세요.
        num = 1;
        int sum = 0;
        while (num <= 10){
            sum += num;
            System.out.println("현재숫자 : "+num+", 현재까지 합계 : "+ sum);
            num++;

        }

    }
}
