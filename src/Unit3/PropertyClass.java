package Unit3;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PropertyClass {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\Users\\imaks\\IdeaProjects\\OPPs Using Java\\src\\Unit3\\db.properties");
            Properties p = new Properties();
            p.load(fr);
//            System.out.println(p.getProperty("user"));
//            System.out.println(p.getProperty("coupon"));
            Set s1 = p.entrySet();
            Iterator itr = s1.iterator();
            while(itr.hasNext()){
//                Map.Entry entry = (Map.Entry);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
