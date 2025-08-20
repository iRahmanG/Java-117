abstract class StudentAbstract {
    String name;
    int rollNo;

    public StudentAbstract(String name,int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    abstract void attend_class();
    abstract void give_exam();
}
