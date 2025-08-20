public class Student {
    String name;
    int roll;

    Student(int r,String n){
        roll=r;
        name=n;
    }
    public void display(){
        System.out.println("Roll No: "+roll + "\nName : "+name);
    }
}
