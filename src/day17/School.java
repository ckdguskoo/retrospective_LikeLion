package day17;

// School.java
public class School {
    private String schoolName;  // 학교 이름
    private int grade;          // 학년

    // 생성자
    public School(String schoolName, int grade) {
        this.schoolName = schoolName;
        this.grade = grade;
    }

    // 외부 클래스 정보 반환
    public String getSchoolInfo() {
        return "학교명: " + schoolName + "\n학년: " + grade + "학년";
    }

    // 멤버 내부 클래스 Class
    public class Class {
        private String className;    // 반 이름
        private int studentCount;    // 학생 수

        // 생성자
        public Class(String className, int studentCount) {
            this.className = className;
            this.studentCount = studentCount;
        }

        // 학급 정보 출력
        public void printClassInfo() {
            // 외부 클래스의 private 멤버 접근 가능
            System.out.println(School.this.getSchoolInfo());
            System.out.println("학급명: " + className + "반");
            System.out.println("학생 수: " + studentCount + "명");
        }
    }
    // Main.java
    public class Main {
        public static void main(String[] args) {
            School mySchool = new School("행복고등학교", 2);
            School.Class class1 = mySchool.new Class("2-3", 30);

            class1.printClassInfo();
        }
    }
}