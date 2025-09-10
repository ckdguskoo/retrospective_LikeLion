package day7;

public class Array2Exam {
    public static void main(String[] args) {
        //아래와 같은 2차원 배열의 [1][1]에 있는 값을 출력해보세요.
        //
        //1 2
        //3 4

        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        System.out.println(arr[1][1]);


        //아래의 2x2 배열에서 [0][1] 위치의 값을 9로 변경해보세요.
        int[][] arr1 = {
                {1, 2},
                {3, 4}
        };

        arr1[0][1] = 9;
        System.out.println(arr1[0][1]);


        //2x3 크기의 배열에 가로로 1부터 차례대로 숫자를 채워 출력해 보세요.
        //1 2 3
        //4 5 6

        int[][] arr2 = new int[2][3];
        int val = 1;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = val;
                val++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }

        }

    }
}
