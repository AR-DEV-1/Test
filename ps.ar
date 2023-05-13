import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private List<Server> servers;
    private Map<String, Server> codeToServerMap;

    public Game() {
        servers = new ArrayList<>();
        codeToServerMap = new HashMap<>();
    }

    public void addServer(Server server) {
        servers.add(server);
    }

    public void removeServer(Server server) {
        servers.remove(server);
        codeToServerMap.remove(server.getCode());
    }

    public List<Server> getServers() {
        return servers;
    }

    public Server getServerByCode(String code) {
        return codeToServerMap.get(code);
    }

    public Server createServer(String name, int capacity) {
        Server server = new Server(name, capacity);
        String code = generateCode();
        server.setCode(code);
        codeToServerMap.put(code, server);
        servers.add(server);
        return server;
    }

    private String generateCode() {
        // generate a unique code for the server
        return "ABC123";
    }
}

public class Server {
    private String name;
    private int capacity;
    private int currentPlayers;
    private String code;

    public Server(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentPlayers() {
        return currentPlayers;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void join() {
        if (currentPlayers < capacity) {
            currentPlayers++;
            System.out.println("Player joined " + name + ". Current players: " + currentPlayers);
        } else {
            System.out.println(name + " is full. Please try another server.");
        }
    }

    public void leave() {
        currentPlayers--;
        System.out.println("Player left " + name + ". Current players: " + currentPlayers);
    }
}
