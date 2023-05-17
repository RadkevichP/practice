package org.example.memory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pradkevich
 * @since 23.6
 */
public class Automatic {


    public static void main(String[] args) {
        while (true) {
            createGarbage();
        }
    }

    private static void createGarbage() {
        List<BigDecimal> result = new ArrayList<>();
        for (int i = 0; i < 700000; i++) {
            result.add(new BigDecimal(i));
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Garbage created!");
    }
}
