import java.util.HashMap;
import java.util.Map;


class UserDatabase {
    private static final Map<Integer, Integer> users = new HashMap<>();

    public static boolean addUser(int acNumber, int password) {
        if (users.containsKey(acNumber)) {
            return false; // User already exists
        }
        users.put(acNumber, password);
        return true; // User added successfully
    }

    public static boolean isValidUser(int acNumber, int password) {
        Integer storedPassword = users.get(acNumber);
        return storedPassword != null && storedPassword == password;
    }
}
