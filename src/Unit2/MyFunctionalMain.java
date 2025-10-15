package Unit2;

public class MyFunctionalMain {
    public static void main(String[] args) {
        Sayable sayable = MethodReference::saySomething;
        sayable.say();
        sayable.sayMore();
    }
}
