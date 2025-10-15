package Unit2;

@FunctionalInterface
public interface Sayable {
    default void sayMore(){
        System.out.println("Say more method");
    }
    void say();
}
