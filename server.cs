import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Server> servers;

    public Game() {
        servers = new ArrayList<>();
    }

    public void addServer(Server server) {
        servers.add(server);
    }

    public void removeServer(Server server) {
        servers.remove(server);
    }

    public List<Server> getServers() {
        return servers;
    }
}

public class Server {
    private String name;
    private int capacity;
    private int currentPlayers;

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
