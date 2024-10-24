package lesson_30.person;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class) // Тесты будут выполняться по алфавитному порядку

public class OrderedTestsByName {
    @Test
    void testB(){
        System.out.println("Test b");
    }

    @Test
    void testA(){
        System.out.println("Test a");
    }

    @Test
    void testC(){
        System.out.println("Test c");
    }

    @Test
    void testD(){
        System.out.println("Test d");
    }
}
