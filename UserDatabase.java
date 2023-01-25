import java.util.HashMap;

public class UserDatabase {
    private HashMap<String, Person> users;

    public UserDatabase() {
        users = new HashMap<>();
    }

    public void addUser(Person newUser) {
        users.put(newUser.getEmail(),newUser);
    }

    public Person getUser(String email) {
        return users.get(email);
    }

    public boolean checkEmail(String email) {
        return users.containsKey(email);
    }
}