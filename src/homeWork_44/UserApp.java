package homeWork_44;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserApp {

    public static Optional<User> findUserById(List<User> users, int id){
        Optional<User> user = users.stream()
                .filter(user1 -> user1.getId() == id)
                .peek(System.out::println)
                .findFirst(); // вернули первого которого нашли
        // findFirst - терминальный метод, возвращаюший Optional, в который завернут первый элемент потока (если он есть) или пустой Optional
        // Прекращает обработку потока, когда будет найден первый элемент
        return user;

    }
}
