package day7;

public class ForEachExam {
    public static void main(String[] args) {
        //for each를 사용하여 숫자 배열의 모든 값을 출력해보세요.

        int[] numbers = {1, 2, 3, 4, 5};
        for(int n : numbers){
            System.out.print(n+ " ");

        }

        //for each를 사용하여 숫자 배열에서 각 숫자가 짝수인지 홀수인지 출력해보세요.

        int[] numbers2 = {10, 11, 12, 13, 14, 15, 16};
        for(int i : numbers2){
            if (i%2 ==0){
                System.out.println(i + " : 짝수");
            }
            else{
                System.out.println(i +" : 홀수");
            }
        }


        //점수 배열에서 각 점수가 60점 이상이면 "합격", 미만이면 "불합격"을 출력해보세요.
        //
        //for each 와 삼항연산자를 사용해 주세요.

        int[] scores = {85, 50, 95, 30, 70};
        String result;
        for(int i : scores){
            System.out.println(result = (i>=60) ? i+"점 : 합격" :i+"점 : 불합격");
        }


        //for each를 사용하여 이름 배열에서 3글자 초과인 이름만 출력해보세요.
        //
        String[] names = {"홍길동", "김철수", "이순신님", "박찬호"};
        for (String c : names){
            if (c.length()>3){
                System.out.println(c);
            }
        }


        //숫자 배열에서 각 숫자가 5보다 큰지 작은지 출력해보세요.
        //
        int[] numbers3 = {3, 7, 2, 9, 4, 5};
        for(int n : numbers3){
            if (n > 5){
                System.out.println(n + " : 5보다 큼");
            }
            else if(n < 5){
                System.out.println(n + " : 5보다 작음");
            }
            else {
                System.out.println(n + " : 5랑 같음");
            }
        }
    }
}
