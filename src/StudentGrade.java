public class StudentGrade {
    // Encapsulation example
    // the variable cannot be accessed outside of this class
    private String grade;
    public int rollNo;
    public String name;
    StudentGrade(String grade,int rollNo,String name){
      this.grade = grade;
      this.rollNo = rollNo;
      this.name = name;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
