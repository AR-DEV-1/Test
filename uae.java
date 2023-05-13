public class GameServer {
    private UserManager userManager;
    
    public GameServer() {
        this.userManager = new UserManager();
    }
    
    public void start() {
        // Start the server...
    }
    
    public void handleClient(Client client) {
        // Authenticate the user
        boolean authenticated = userManager.authenticateUser(client.getUsername(), client.getPassword());
        if (!authenticated) {
            client.sendError("Invalid username or password");
            return;
        }
        
        // Check if user is authorized
        if (!userManager.isAuthorized(client.getUsername())) {
            client.sendError("You are not authorized to access this server");
            return;
        }
        
        // Handle the client's requests...
    }
}

