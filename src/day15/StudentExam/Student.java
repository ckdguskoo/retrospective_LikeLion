package day15.StudentExam;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void displayInfo() {
        System.out.println("학생 정보를 출력합니다.");
        System.out.println("이름: " + name);
        System.out.println("학년: " + grade);
    }
}
