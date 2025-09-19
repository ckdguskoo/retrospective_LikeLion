package day12;

public class MethodOverrodingExam {
    //계산기
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public double add(int a, double b){
        return a+b;
    }

    public static class Studentinfo{
        public void name(String name){
            System.out.println(name);
        }
        public void name(String name, String grade){
            System.out.println(name);
            System.out.println(grade);
        }
        public void name(String name, String grade, String classNum){
            System.out.println(name);
            System.out.println(grade);
            System.out.println(classNum);
        }
        public void name(String name, String grade, String classNum, String number){
            System.out.println(name);
            System.out.println(grade);
            System.out.println(classNum);
            System.out.println(number);
        }

    }



    public static void main(String[] args) {
        MethodOverrodingExam exam = new MethodOverrodingExam();
        Studentinfo studentinfo = new Studentinfo();

        System.out.println(exam.add(1,2,3));
        System.out.println(exam.add(1,3.156));
        System.out.println(exam.add(3.54,159.51));
        studentinfo.name("구창현");
        studentinfo.name("구창현","2학년");
        studentinfo.name("구창현","2","6");
        studentinfo.name("구창현","2","6","3");
    }
}
