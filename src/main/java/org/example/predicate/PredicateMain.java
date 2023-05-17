package org.example.predicate;

import java.util.function.Predicate;

import org.example.Data;

/**
 * @author pradkevich
 * @since 23.6
 */
public class PredicateMain {

    public static void main(String[] args) {

        int age = 18;

        Predicate<Data> adultCheck = data -> data.getAge() >= age;

        Predicate<Data> nameLengthCheck = data -> data.getName().length() > 0;

    }

    private void check(Data data, Predicate<Data> checker) {
        System.out.println(checker.test(data));
    }


}
