package homeWork_43.task3;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonStreams {
    public static void main(String[] args) {
         /*
    Task 3
Дан список Person с полями name, age, city.
 Используйте Stream API для фильтрации людей, которые старше определенного возраста
 и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
     */

        sortPerson();

    }// main

        private static void sortPerson(){
            List<Person> personsList = getPersonsList();

            Stream<Person> personStream = personsList.stream()
                    .filter(person -> person.getAge() > 25 && person.getCity().equalsIgnoreCase("Berlin"));

            // Objects.equals(city, person.getCity) это когда метод принимает параметры age, city БЕЗОПАСНО ПРИ НАЛИЧИИ null

            List<Person> sortedByAgeAndCity = personStream.collect(Collectors.toList());

            System.out.println( sortedByAgeAndCity);
        }// sortPerson


        private static List<Person> getPersonsList(){
            return List.of(
                    new Person("Ben", 25, "Dresden"),
                    new Person("Tom", 56, "Berlin"),
                    new Person("Sebastian", 24, "London"),
                    new Person("Roberto", 34, "Berlin"),
                    new Person("Leo", 24, "Berlin")

            );
        }
    }

