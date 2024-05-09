import java.util.ArrayList;
import java.util.List;


public class  UserFactory {
    public static List<User> createUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Иван", "Ivan", "fkds", 15));
        users.add(new User("Василий", "Vasiliy", "cnskd", 65));
        users.add(new User("Демьян", "Demyan", "cmfdkl", 30));
        users.add(new User("Андрей", "Andrey", "mckds", 17));
        users.add(new User("Максим", "Maksim", "cmksdl", 28));
        users.add(new User("Тарас", "Taras", "fkdsf", 21));
        users.add(new User("Артем", "Artem", "mdks", 44));
        users.add(new User("Сергей", "Sergei", "oeif", 53));
        return users;
    }
}
