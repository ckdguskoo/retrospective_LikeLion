package day1;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class comment {
    public static void main(String[] args) {
        //출력문 실행
        // 행단위 주석
       // System.out.println("Hello");
        /* System.out.println("Hello"); 블럭단위 주석
        System.out.println("Hello");*/
        //이 부분은 주석입니다. 컴파일 오류가 발생합니다.
        System.out.println("Hello, World!");

        /*이 부분은
        여러 줄 주석으로
        처리해야 합니다.*/
        System.out.println("Hello, World!");

        /* 이 코드는 주석이어야 합니다. */
        System.out.println("Hello, World!");

        System.out.println("Start Program");
        System.out.println("This line should be commented out!");
        System.out.println("End Program");

        System.out.println("Start Program");
        /* 이 부분에서 주석이 열렸지만 닫히지 않았습니다.*/
        System.out.println("This line should be executed");
    }
}