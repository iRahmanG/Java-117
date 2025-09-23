import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NameValeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String,Integer> map = new TreeMap<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String line[] = sc.nextLine().split(" ");

            int num = Integer.parseInt(line[1]);
            map.put(line[0],map.getOrDefault(line[0],0)+num);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
