package day10;

public class ScopeWithStaticExam {
//    static int count = 0;    // 클래스 변수
//    int instanceCount = 0;   // 인스턴스 변수
//
//    //다음 코드의 출력값을 예측해보세요.
//    public void increase() {
//        count++;
//        instanceCount++;
//    }
//
//    public static void main(String[] args) {
//        ScopeWithStaticExam s1 = new ScopeWithStaticExam();
//        ScopeWithStaticExam s2 = new ScopeWithStaticExam();
//
//        s1.increase();
//        s2.increase();
//
//        System.out.println("s1 count=" + s1.count);
//        System.out.println("s2 count=" + s2.count);
//        System.out.println("s1 instanceCount=" + s1.instanceCount);
//        System.out.println("s2 instanceCount=" + s2.instanceCount);
//    }

    //다음 코드의 오류를 찾고 수정해보세요.
    public class StaticTest2 {

        static String name = "홍길동";       // 인스턴스 변수 static추가
        static int age = 20;        // 클래스 변수

        public static void printInfo() {
            System.out.println("이름: " + name);  // 오류 발생
            System.out.println("나이: " + age);   // 정상 작동
        }

    }


}

