import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Player {
    private String name;
    private int health;
    private ArrayList<Ship> ships;
    private ArrayList<Plane> planes;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.ships = new ArrayList<>();
        this.planes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }
}

class Ship {
    private String name;
    private int health;
    private int damage;

    public Ship(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }
}

class Plane {
    private String name;
    private int health;
    private int damage;

    public Plane(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }
}

class Game {
    private ArrayList<Player> players;

    public Game() {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void start() {
        System.out.println("Starting game...");

        for (Player player : players) {
            System.out.println("Player " + player.getName() + " is starting with " + player.getShips().size() + " ships and " + player.getPlanes().size() + " planes.");
        }

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int round = 1;

        while (players.size() > 1) {
            System.out.println("Round " + round + " starting...");

            for (Player player : players) {
                System.out.println("Player " + player.getName() + "'s turn.");
                System.out.println("Choose a ship or plane to attack with:");

                ArrayList<Object> units = new ArrayList<>();
                units.addAll(player.getShips());
                units.addAll(player.getPlanes());

                for (int i = 0; i < units.size(); i++) {
                    Object unit = units.get(i);

                    if (unit instanceof Ship) {
                        Ship ship = (Ship) unit;
                        System.out.println((i + 1) + ". " + ship.getName() + " (health: " + ship.getHealth() + ")");
                    } else if (unit instanceof Plane) {
                        Plane plane = (Plane) unit;
                        System.out.println((i + 1) + ". " + plane
