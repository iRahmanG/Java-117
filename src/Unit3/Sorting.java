package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);

        System.out.println("before -> "+al);
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println("after -> "+al);

    }
}
