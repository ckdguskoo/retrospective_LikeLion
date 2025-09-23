package day15.StudentExam;

public class HighSchoolStudent extends Student {
    private int classRoom ;
    public HighSchoolStudent(String name, int grade, int classRoom ) {
        super(name, grade);
        this.classRoom = classRoom;
    }


    public int getClassRoom() {
        return classRoom;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getGrade() {
        return super.getGrade();
    }

    @Override
    public void displayInfo() {
        System.out.println("학생 정보를 출력합니다.");
        System.out.println("이름: " + getName());
        System.out.println("학년: " + getGrade());
        System.out.println("반 : " + getClassRoom() );
    }
}
