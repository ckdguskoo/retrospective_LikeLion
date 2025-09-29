package day19;

public class ExceptionExam2 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = divide(i,j);
            System.out.println(k);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public static int divide(int i, int j) throws IllegalArgumentException { //예외 넘기기
        if (j == 0){
            //return 0;
            throw new IllegalArgumentException("0으로 나눌 수 없습니다"); //예외 발생
        }
        int k = i/j;
        return k;
    }
}
