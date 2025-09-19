package Unit3;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer>hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String key = sc.next();
            int val = sc.nextInt();
            hm.put(key,val);
        }
        for(String str :hm.keySet()){
            System.out.println(hm.get(str));
        }
    }
}
