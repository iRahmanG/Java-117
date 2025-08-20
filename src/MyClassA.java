public class MyClassA{
    static {
        System.out.println("I am in static block");
    }
    public static void main(String arggs[]){
        A a1 = new A();
        A a2 = new A();
        a1.bread =a1.bread-1;
        System.out.println(a2.bread);
    }

}
