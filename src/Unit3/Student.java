package Unit3;

public class Student implements Comparable<Student>{
    int age;
    String name;
    int rollNo;

    public Student(int age,String name,int rollNo){
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student st) {
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}
