package loginandsignup;

import java.util.HashMap;

public class UserStore {

    // Temporary in-memory storage
    public static HashMap<String, String> users = new HashMap<>();

    public static boolean registerUser(String email, String password) {
        if(users.containsKey(email)) {
            return false; // already exists
        }

        users.put(email, password);
        return true;
    }

    public static boolean loginUser(String email, String password) {
        if(!users.containsKey(email)) {
            return false;
        }

        return users.get(email).equals(password);
    }
}
