import java.awt.*;
import java.util.function.*;

import static java.lang.System.out;

public class practice {
    public static int main(String[] args) {
        Function<Integer, Integer> inc = number -> number + 1;

        IntBinaryOperator add = (a, b) -> a + b;
        int x = inc.apply(5);
        out.println(x);
        Consumer<T> tConsumer = string -> System.out.println(string);

        static int increment ( int number){
            return number + 1;
        }
        IntSupplier rand = () -> 4;

        IntPredicate keyEventDispatcher = number -> number > 0;

    }
}
