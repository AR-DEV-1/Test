public class User {
    private String username;
    private String password;
    private boolean authorized;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.authorized = false;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public boolean isAuthorized() {
        return authorized;
    }
    
    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }
}
