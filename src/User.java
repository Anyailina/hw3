public class User {
    private String name;
    private String login;
    private String password;
    private int age;

    public User(String name,String login,String password, int age) {
        this.login = login;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
