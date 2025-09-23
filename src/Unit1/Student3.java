package Unit1;

public class Student3 {
    String name;
    int roll;

    Student3(int r, String n){
        roll=r;
        name=n;
    }
    public void display(){

        System.out.println("Roll No: "+roll + "\nName : "+name);
    }
}
