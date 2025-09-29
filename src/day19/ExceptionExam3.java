package day19;

public class ExceptionExam3 extends RuntimeException { //예외 생성
    public ExceptionExam3(String message) {
        super(message);
    }

    public ExceptionExam3(Exception e) {
        super(e);
    }
}
