package Unit3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("First");
        ll.add("Second");
        ll.add("Third");

        Iterator it = ll.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        ll.remove("First");
        ll.addLast("Fourth");
        ll.addFirst("Five");
        System.out.println("-------------");
        Iterator itr = ll.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
