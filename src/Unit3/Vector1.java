package Unit3;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>(3,5);
        vec.add("First");
        vec.add("Second");
        vec.add("Thirsd");
        System.out.println(vec.capacity());
        vec.add("Four`  ");
        System.out.println(vec.capacity());

    }
}
