package day9;

public class MethodExam {
    //매개변수로 전달받은 이름(Jane)을 출력하는 메소드를 작성하세요.
    //
    //클래스명: Greeter 메소드명: sayHello

    static class Greeter {
        public void sayHello() {
            System.out.println("Hello, jane!");
        }
    }

        //두 숫자(10, 3)를 더한 결과를 반환하는 메소드를 작성하세요.
    //
    //클래스명: Calculator 메소드명: add
    static class Calculator {
        int a =10;
        int b = 3;
        public int add() {
            return a + b;
        }
    }

    //입력받은 문자열(java)의 길이를 반환하는 메소드를 작성하세요.
    //
    //클래스명: StringLengthCalculator 메소드명: getLength

    static class StringLengthCalculator{
        public void getLength(String s){
            System.out.println(s.length());
        }
    }


    //정수 배열(1,2,3,4,5)의 모든 요소의 합을 계산하여 반환하는 메소드를 작성하세요.
    //
    //클래스명: ArraySumCalculator 메소드명: calculateSum

    static class ArraySumCalculator{
        int a = 0;
        public void calculateSum(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                a += arr[i];
            }
            System.out.println(a);
        }
    }


    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.sayHello();

        Calculator calculator = new Calculator();
        System.out.println(calculator.add());

        StringLengthCalculator stringLengthCalculator = new StringLengthCalculator();
        stringLengthCalculator.getLength("Hello");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArraySumCalculator arraySumCalculator = new ArraySumCalculator();
        arraySumCalculator.calculateSum(arr);

    }
}

