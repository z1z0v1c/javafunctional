package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        increment = incrementByOneFunction.apply(0);
        System.out.println(increment);

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static int increment(int number) {
        return ++number;
    }
}
