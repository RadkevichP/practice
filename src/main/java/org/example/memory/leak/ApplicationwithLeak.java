package org.example.memory.leak;

import java.util.Scanner;

/**
 * @author pradkevich
 * @since 23.6
 */
public class ApplicationwithLeak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LeakingCreationService service = new LeakingCreationService();

        while (true) {
            System.out.println("Введите количество объектов для содания: ");

            long quantity = scanner.nextLong();
            if (quantity == -1) return;
            service.createGarbageObjects(quantity);
        }
    }
}
