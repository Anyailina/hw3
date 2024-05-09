import java.util.List;
import java.util.Scanner;


public class Main {
    private static List<User> users = UserFactory.createUsers();
    public static void main(String[] args) {
        String login = new Scanner(System.in).nextLine();
        String password = new Scanner(System.in).nextLine();
        try {
            authorization(login,password);
            System.out.println("Авторизация прошла успешно");
        } catch (WrongLoginException | WrongPasswordException | WrongAgeException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void authorization(String login,String password) throws WrongLoginException, WrongPasswordException, WrongAgeException{
        User user = users.stream()
                .filter(user1 -> user1.getLogin().hashCode() == login.hashCode() && user1.getLogin().equals(login))
                .findAny().orElse(null);
        if(user == null){
            throw new WrongLoginException("Не существует такого логина");
        }

        String userPassword = user.getPassword();

        if(userPassword.hashCode() != password.hashCode() || !userPassword.equals(password) ){
            throw new WrongPasswordException("Неверный пароль");
        }

        if(user.getAge() < 18){
            throw new WrongAgeException("Возраст должен быть 18 и более");
        }

    }
}