package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(19,"Maksud",14123));
        al.add(new Student(20,"Rahman",14126));
        al.add(new Student(17,"Nikhil",14125));
        al.add(new Student(21,"Nilesh",14120));
        al.add(new Student(16,"Harsh",14124));
        al.add(new Student(18,"Vardhan",14130));

        Collections.sort(al);
        for (Student s: al){
            System.out.println("Name- "+s.name +" Age- "+s.age+" Roll No- "+s.rollNo);
        }
    }
}

