import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;
    
    public UserManager() {
        this.users = new ArrayList<>();
    }
    
    public void addUser(User user) {
        this.users.add(user);
    }
    
    public boolean authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                user.setAuthorized(true);
                return true;
            }
        }
        return false;
    }
    
    public boolean isAuthorized(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.isAuthorized()) {
                return true;
            }
        }
        return false;
    }
}
