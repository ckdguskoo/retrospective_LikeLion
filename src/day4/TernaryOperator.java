package day4;

public class TernaryOperator {
    public static void main(String[] args) {
        //시험 점수가 60점 이상이면 "합격", 미만이면 "불합격"을 출력하는 프로그램을 만드세요.

        int scorer = 90;
        String result= (scorer>=60)? "합격" : "불합격";
        System.out.println(result);

        //숫자가 짝수면 "짝수", 홀수면 "홀수"를 출력하는 프로그램을 만드세요.
        int num = 17;
        String oldOrEven = (num/2 ==0) ? "짝수" : "홀수";
        System.out.println(oldOrEven);

        //점수가 90점 이상이면 "A", 그렇지 않으면 "B"를 출력하는 프로그램을 만드세요.
        //int scorer =60;
        String result2 = (scorer>=90) ? "A" :  "B";
        System.out.println(result2);

        //키가 130cm 이상이면 "탑승 가능", 미만이면 "탑승 불가"를 출력하는 프로그램을 만드세요.
        int lenth =130;
        String able = (lenth>=130) ? "탑승가능" : "탑슬 불가";
        System.out.println(able);

        //월(month)이 3~8월이면 "더운 계절", 그 외는 "추운 계절"을 출력하는 프로그램을 만드세요.
        int month = 3;
        String hot = (month>=3 && month<=8) ? "더운계절" : "추운계절";
        System.out.println(hot);



    }
}
