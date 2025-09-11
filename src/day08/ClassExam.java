package day08;

class car{ //클래스 생성

}




public class ClassExam {
    public static void main(String[] args) {
        car car1 = new car();
        car car2 = new car(); //인스턴스

        // 참조 타입
        int i = 4; //기본형 변수
        String str = new String("Hello"); //참조형 변수 타입


        //String 클래스
        String str2 = "Hello"; //new를 사용하지 않고도 생성가능, 상수 영역에하나 만들어짐
        String str3 = "Hello"; // 상수영역에서 한번 찾아보고위에 str2가 저장된영역에서 참조
        String str4 = new String("Hello"); //new를 사용해서도 생성가능 hip 영역에 '새로'생성
        String str5 = new String("Hello"); //

        if (str2 == str3)
            System.out.println(true); //true

        if (str3 == str4)
            System.out.println(true); //값이 안나옴 즉 false

        if (str3 == str4)
            System.out.println(true);  //값이 안나옴 즉 false

        System.out.println(str2);
        System.out.println(str2.substring(3)); //3번부터 출력 String을 리턴
        System.out.println(str2); //String은 한번 만들어진 값이 변하지 않음

    }
}



