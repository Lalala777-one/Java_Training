package lesson_30.person;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// упорядочить выполнение тестов

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)  // порядок запуска тестовых методов в классе будет определяться
// аннотацией @Order

public class OrderedTests {
    @Test
    @Order(10)
    void firstTest(){
        System.out.println("FirstTest");
    };

    @Test
    @Order(20)
    void secondTest(){
        System.out.println("Second Test");
    }

    @Test
    @Order(30)
    void thirdTest(){
        System.out.println("Third test");
    }

    @Test
    @Order(15)
    void betweenTest(){
        System.out.println("between Test");
    }

    @Test
   void randomTest(){
        System.out.println("random Test");
    }

    @Test
    void randomTest1() {
        System.out.println("random Test1");
    }
}
