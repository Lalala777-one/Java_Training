package lesson_30.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


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
    public void testFruits(String fruit) {

        System.out.println(fruit);
        assertTrue(fruit.length() > 2);


    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, -5, 5})
    void testInts(int value) {
        System.out.println("current value: " + value);
        Assertions.assertTrue(value > -6);
    }

    // CSV Comma Separated-Value
    // Источник данных в формате CSV
    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
    void testWihtCsvSourse(String fruit, int rank) {
        System.out.println(fruit + " | " + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);
    }


    // Источник данных файл в формате CSV
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testCsvFileSourse(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }


    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourse(String fruit) {
        System.out.println(fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", "cherry");
    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSourse2(int value) {
        System.out.println("current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, 3, 4);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSource3(int value, int expected, boolean isEquels) {
        System.out.println(value + " | " + expected + " | " + isEquels);
        int result = value * value;
        // assertEquals(expected, result);
        assertEquals(isEquels, result == expected);
    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );

    }


    //

    @ParameterizedTest
    @MethodSource("testPersonsData")
    void testPersonsData(Person person, String newEmail){
        System.out.println(person);
        System.out.println(newEmail);
    }

    static Stream<Arguments> testPersonsData(){
        Person person = new Person("test@mail.ru", "pass1Q!4");
        return Stream.of(
                Arguments.of(person, "new1234@mail.com"),
                Arguments.of(new Person("invalid.mail.com", "password"), "mail.test.com")
        );
    }


}

