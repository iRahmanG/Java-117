public class StudentGradeMain {
    public static void main(String args[]){
        StudentGrade obj = new StudentGrade("A",12,"Maksud");
        System.out.println(obj.name);
        System.out.println(obj.rollNo);
        System.out.println(obj.getGrade());
    }
}
