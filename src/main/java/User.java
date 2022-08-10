import java.util.Objects;

public class User {
    private String name;
    private String login;
    private String password;
    private int age;

    public String getLogin() {
        return login;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public User(String name, String login, String password, int age) {
        this.login = login;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public static User[] getUsers() {
        User user1 = new User("Dima", "dimaBag@yandex.ru", "1111aaaa", 18);
        User user2 = new User("Olya", "olyaBag@yandex.ru", "2222bbbb", 15);
        User user3 = new User("Ivan", "ivanBag@yandex.ru", "3333cccc", 18);
        User user4 = new User("Nikolay", "NikolayBag@yandex.ru", "4444dddd", 30);
        return new User[]{user1, user2, user3, user4};
    }

    @Override
    public String toString() {
        return "taskSecond.User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login) && password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }
}


