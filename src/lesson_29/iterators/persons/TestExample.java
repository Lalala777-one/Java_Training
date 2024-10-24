package lesson_29.iterators.persons;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    // Метод который выолняется перед КАЖДЫМ тестовым методом

    @BeforeEach
    void setUp() {
        System.out.println("Method @BeforeEach");
    }

   /*
 @BeforeAll // Метод запускается только ОДИН раз перед выполнением теста
 @AfterEach // Метод выолняется ПОСЛЕ каждого теста
 @AfterAll // Метод выполняется только ОДИН раз после выполнения ВСЕХ тестовых методов
 @Disabled - указывает что тест отключен и выполняться не будет
 @Nested - позволяет создать вложенный тестовый класс. Может быть использован для логической группировки тестовых методов

    */


    // Указывает что метод является тестовым

    @Test

    public void testAddition() {

        System.out.println("Method Addition");
        int result = 2 + 2;

        // Ожидаемое значение 4
        // Реальное значение сохранено в переменной result
        // нужно сравнить совпадает ли ожидаемое с реальным

        // МЕТОДЫ ПРОВЕРКИ УТВЕРЖДЕНИЙ

        // assertEquels(expected, actual) - проверяет равны ли два значения

        Assertions.assertEquals(4, result);
        Assertions.assertNotEquals(3, result); // тест будет пройден, если НЕ ОЖИДАЕМЫЙ результат
        // не совпадает с фактичеким
        Assertions.assertTrue(result >= 4); // проверяет, что условие верно (возвращает true)
        assertFalse(result < 4); // проверяет, что условие ложно (возвращает false)

        assertNull(null);  // Проверяет что объект РАВЕН null
        assertNotNull("String"); // Проверяет что объект НЕ РАВЕН null
    }

    @Test
    public void emptyTest() {
        System.out.println("Test empty");

        // Пустой тестовый метод считает пройденным
        // Если в методе нет ложного утверждения

    }

    // ПАРАМЕТРИЗИРОВАННЫЕ ТЕСТЫ

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    public void testFruits(String fruit){

        System.out.println(fruit);
        assertTrue(fruit.length() > 2);
    }
}