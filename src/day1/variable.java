package day1;

class Person{
    static int count = 24;
    //클래스 변수 : static키워드 사용
    //클래스가 로드될 때 생성 -> 프로그램 종료까지 유지 모든 객체가 공유
}

public class variable {
    Person person =new Person();
    void method(){
        //지역변수, 메서드, 블럭안에서 선언
        //블럭이 끝나면 메모리에서 사라짐
        String name = "구창현";
    }
    int price = 30000; //클래스 변수 : 클래스 안, 메서드 밖에 선언, 객체가 생성될 때 함께 생성
    public static void main(String[] args) {
        variable var = new variable();

        // System.out.println(name); 지역변수 에러발생

        int num;
        num = 23;

        int num2 = 22;



        System.out.println(num);
        System.out.println(num2);

        System.out.println(Person.count);

        System.out.println(var.price);

        // 문자열 두 개의 변수를 선언하고 하나의 문장을 출력하세요.
        String hi = "Hello ";
        String world = "World";
        System.out.println(hi + world);

        //두 개의 정수형 변수를 선언하고 초기화한 후, 두 숫자의 합을 계산하여 출력하세요.
        int x = 10;
        int y = 20;
        System.out.println(x+y);

        //문자열 변수를 선언하여 "Hello, Java!"를 저장하고 출력하세요.
        String hijava = "Hello, JAVA!";
        System.out.println(hijava);

        //이름, 나이, 좋아하는 색을 저장하는 변수를 선언하고 출력하세요.
        System.out.println();
        String name = "홍길동";
        int age = 22;
        String favoriteColor = "blue";
        System.out.printf("이름 : %s, 나이 : %d, 좋아하는 색깔 : %s",name,age,favoriteColor);
        System.out.println();


        //변수에 초기값을 저장한 후, 새 값을 재할당하여 변경된 값을 출력하세요.
        int first = 123;
        System.out.println(first);
        first = 9876;
        System.out.println(first);

    }


}
