package Unit3;

import java.util.*;
import java.util.Collections;

public class ArrayList_String {
    public static void main(String [] args){
        ArrayList<String> products = new ArrayList<>();
        System.out.println("Enter the number of Products");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            products.add(sc.next());
        }
        Collections.sort(products); // use before Iterator
        Iterator it = products.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        products.add(1,"Appple");
        System.out.println(products.get(2)); // give value at the index
    }
}
