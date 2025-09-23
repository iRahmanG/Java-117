package Unit2;

public class LamdaDemo {
    public static void main(String[] args) {
        NumericTest isEven= (n) -> n%2==0;
        System.out.println(isEven.test(17));
    }
}
