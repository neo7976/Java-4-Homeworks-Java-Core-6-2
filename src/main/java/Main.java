
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedExсeption {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
//        String login = "dimaBag@yandex.ru";
//        String password = "1111aaaa";

        final User byLoginAndPassword = getUserByLoginAndPassword(login, password);
        validateUser(byLoginAndPassword);

        System.out.println("Доступ предоставлен!");

    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = User.getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password))
                return user;
        }
        throw new UserNotFoundException("taskSecond.User not Found");
    }

    public static void validateUser(User user) throws AccessDeniedExсeption {
        if (user.getAge() < 18)
            throw new AccessDeniedExсeption("Вам нет 18 лет!");
        System.out.printf("Добро пожаловать, %s!!!\n", user.getName());
    }
}
