package org.example.functional;

/**
 * @author pradkevich
 * @since 23.6
 */
public class Main {

    public static void main(String[] args) {
        MyFunction incrementByOne = i -> i + 1;

        Integer increment = incrementByOne.increment(100);
        System.out.println(increment);

        Integer incremented = useFunctional(incrementByOne, 120);
        System.out.println(incremented);

        makeJob(111, MathHelper::isEven);

        MathHelper helper = new MathHelper();
        makeJob(300, helper::isPositive);


    }

    private static void makeJob(Integer number, NumberChecker checker) {
        System.out.println(checker.check(number));
    }

    private static Integer useFunctional(MyFunction incrementer, Integer numberToIncrement) {
        return incrementer.increment(numberToIncrement);
    }
}
