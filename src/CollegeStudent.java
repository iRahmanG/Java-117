public class CollegeStudent extends StudentAbstract {

    public CollegeStudent(String name, int rollNo) {
        super(name, rollNo);
    }

    @Override
    void attend_class() {
        System.out.println(name+" Attend class on Smart Board");
    }

    @Override
    void give_exam() {
        System.out.println(rollNo+" give exam online");
    }
}
