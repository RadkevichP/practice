package org.example.memory.leak;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pradkevich
 * @since 23.6
 */
public class LeakingCreationService {

    private List<BigDecimal> sevens = new ArrayList<>();

    public void createGarbageObjects(long quantity) {
        List<BigDecimal> garbage = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            garbage.add(createObject(i));
            if (i % 3 == 0) {
                sevens.add(createObject(i));
            }
        }
        System.out.println("Все объекты созданы, сэр!");
    }

    private BigDecimal createObject(long i) {
        return BigDecimal.valueOf(i);
    }
}
