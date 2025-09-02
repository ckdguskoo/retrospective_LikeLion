package day2;

public class typeCast {
    public static void main(String[] args) {
        int x =50000;
        long y = x; //묵시적 형변환
        System.out.println(x); //50000

        long x2 =5;
        //int y2 = x2; //에러 발생
        int y2 = (int) x2; //명시적 형변환

        //int 타입 변수를 double 타입 변수로 변환하세요.
        // 업캐스팅(묵시적 형변환) 이 이루어지는 것을 확인하세요.
        int inum = 42;
        double dnum = inum;
        System.out.println(inum);

        //double 타입 변수를 int 타입 변수로 변환하세요.
        // 다운캐스팅(명시적 형변환)을 통해 소수점 이하 데이터가 손실되는 것을 확인하세요.
        double dob = 3.141592;
        int pi = (int)dob;
        System.out.println(pi);

        //char 타입 변수를 int 타입 변수로 변환하세요.
        // 문자의 ASCII 코드 값이 저장됩니다.
        char c = 'A';
        int ch = c;
        System.out.println(ch);

        //int 타입 변수를 char 타입 변수로 변환하세요.
        // 다운캐스팅(명시적 형변환)을 통해 정수를 문자로 변환합니다.
        int q = 65;
        char w = (char)q;
        System.out.println(w);

        //Integer.parseInt() 메서드를 사용하여 문자열 변수를 정수형으로 변환하세요.
        // 문자열 변수는 정수형으로 변환할 수 있도록 초기화 해 주세요.
        String year = "456";
        int e = Integer.parseInt(year);
        System.out.println(e);
    }

}
