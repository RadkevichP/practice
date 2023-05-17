package org.example.memory.memory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pradkevich
 * @since 23.6
 */
public class DummyService {

    private int version = 1;
    private List<BigDecimal> someData = new ArrayList<>();

    public void doUselessWork() {
        List<BigDecimal> trash = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            trash.add(BigDecimal.valueOf(i));
            if (i % 10 == 0) {
                someData.add(BigDecimal.valueOf(i));
            }
        }
        System.out.println("Dummy job is done!");
    }

}
