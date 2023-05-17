package org.example.memory.memory;

/**
 * @author pradkevich
 * @since 23.6
 */
public class StackDemoApplication {

    public static void main(String[] args) {

        DummyService dummyService = new DummyService();

        for (int i = 0; i < 5; i++) {
            dummyService.doUselessWork();
        }
        System.out.println("Bye!");
    }

}
