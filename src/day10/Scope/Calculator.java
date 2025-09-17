package day10.Scope;
//다른 패키지에 있는 Calculator 클래스의 static 메소드를 호출하는 프로그램을 작성해보세요.

public class Calculator {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

    }
