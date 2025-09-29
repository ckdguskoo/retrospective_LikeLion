package day19;

public class BizService {
    public void bizMethod(int i) throws ExceptionExam3{
        System.out.println("메소드 시작");

        if (i==0){ //0이면 사용자 정의 Exception 실행
            throw new ExceptionExam3("사용자 정의 Exception입니다.");
        }


        System.out.println("메소드 끝");
    }
}
