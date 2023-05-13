public class PrivateServerManager {
    private Map<String, List<String>> serverCodes;
    
    public PrivateServerManager() {
        this.serverCodes = new HashMap<>();
    }
    
    public void generateServerCode(String username) {
        String code = generateRandomCode();
        List<String> usernames = new ArrayList<>();
        usernames.add(username);
        serverCodes.put(code, usernames);
    }
    
    public boolean joinPrivateServer(String code, String username) {
        List<String> usernames = serverCodes.get(code);
        if (usernames == null) {
            return false;
        }
        if (usernames.contains(username)) {
            return true;
        }
        if (usernames.size() < 15) {
            usernames.add(username);
            return true;
        }
        return false;
    }
    
    private String generateRandomCode() {
        // Generate a random code...
    }
}
