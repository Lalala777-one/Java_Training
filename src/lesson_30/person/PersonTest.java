package lesson_30.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonTest {

    Person person;
    String startEmail = "John@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

      /*
    Homework 30
    Task 1
    Написать тесты установки пароля в классе Person. Валидные / не валидные пароли.
     */

    @Test
    void testValidPasswordSet(){
        String validPassword = "Td3rty1Q$";

        person.setPassword(validPassword);
        Assertions.assertEquals(validPassword, person.getPassword());
    }

    @ParameterizedTest
    @MethodSource("invalidPassword")

    void testInvalidPassword(String invalidPassword){
        person.setPassword(invalidPassword);
        Assertions.assertNotEquals(invalidPassword, person.getPassword());
        Assertions.assertEquals(startPassword, person.getPassword());
    }

    static Stream<String> invalidPassword(){
        return Stream.of(
            /*
1. длина >= 8
2. Должна быть мин 1 цифра
3. Должна быть мин 1 маленькая буква
4. Должна быть мин 1 большая буква
5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)
             */

                "qW2fhg!",
                "QwedfghhkcA!",
                "QWERTTZUIO!8",
                "qwertzuio!8",
                "Qwertzu1234"
        );
    }




    /*
    1. Берем валидный email
    2. Устанавливаем сеттером валидный email person
    3. Мы ожидаем: у person в поле email будет этот самые email, кот мы установила на шаге 2
    4. Проверить равенство person.getEmail() с валидным email, который мы устанавливаем
     */

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);
        System.out.println("getEmail " + person.getEmail());
        Assertions.assertEquals(validEmail, person.getEmail()); // что ожидаю - validEmail, фактическое значение person.getEmail()
    }

    /*
    ПРОВЕРКА НЕВАЛИДНОГО ЕМАЙЛ
    1. Берем невалидный email
    2. Устанавливаем сеттером не валидный email person-у
    3. Ожидаемый результат: 1. email установлен не будет. Т.е. значение email у person не будет равно не валидному email
                            2. значение поля email у person останется прежним
     */

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);  //  2. Устанавливаем сеттером не валидный email person-у
        Assertions.assertNotEquals(invalidEmail, person.getEmail()); // не должно быть равно invalidEmail по этому assertNotEquals
        Assertions.assertEquals(startEmail, person.getEmail()); // значение поля email у person останется прежним
    }

    static Stream<String> invalidEmailData() {
        return Stream.of(

                // valid@test.com
                "validtest.com",
                "valid@testcom",
                "valid@@test.com",
                "valid@te@st.com",
                "valid@test.co.m",
                "valid@test.com.",
                "valid@testco.m",
                "valid@ mail.com",
                "valid@ mai!l.com",
                "va*lid@ mail.com",
                "valid@mail.?com",
                "@valid.mail.com",
                "1valid@mail.com",
                "_valid@mail.com",
                "-valid@mail.com"
        );
    }

}



