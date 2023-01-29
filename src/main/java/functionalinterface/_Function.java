package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        increment = incrementByOneFunction.apply(0);
        System.out.println(increment);

        int multiply = multiplyByTen.apply(2);
        System.out.println(multiply);

        Function<Integer, Integer> addOneAndMultiplyByTen = incrementByOneFunction.andThen(multiplyByTen);

        System.out.println(addOneAndMultiplyByTen.apply(4));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    static int increment(int number) {
        return ++number;
    }
}
