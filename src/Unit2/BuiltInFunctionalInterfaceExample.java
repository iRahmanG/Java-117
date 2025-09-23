package Unit2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaceExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n%2==0;
        Function<Integer,Integer> sqaure = n->n*n;
        Consumer<String> display = msg-> System.out.println(msg);
        Supplier<Double> randomValue= ()->Math.random();

        System.out.println("Is 8 even?"+isEven.test(8));
        System.out.println("Sqaure of 5"+sqaure.apply(5));
        display.accept("Hello functional interface!");
        System.out.println("Random number"+randomValue.get());
    }
}
