//imports
import java.util.ArrayList;
import java.util.Random;

//main class
public class WarGame {
    //player class
    class Player {
        String name;
        int team;
        int health;
        ArrayList<Weapon> weapons;
        ArrayList<Item> items;
        Vehicle vehicle;
        Animal animal;

        Player(String name, int team) {
            this.name = name;
            this.team = team;
            this.health = 100;
            this.weapons = new ArrayList<>();
            this.items = new ArrayList<>();
            this.vehicle = null;
            this.animal = null;
        }

        void addWeapon(Weapon weapon) {
            weapons.add(weapon);
        }

        void removeWeapon(Weapon weapon) {
            weapons.remove(weapon);
        }

        void addItem(Item item) {
            items.add(item);
        }

        void removeItem(Item item) {
            items.remove(item);
        }

        void useItem(Item item) {
            switch (item.type) {
                case HEALTH_PACK:
                    health += item.value;
                    if (health > 100) {
                        health = 100;
                    }
                    break;
                case VEHICLE:
                    if (vehicle != null) {
                        vehicle.removePassenger(this);
                    }
                    vehicle = (Vehicle) item;
                    vehicle.addPassenger(this);
                    break;
                case ANIMAL:
                    if (animal != null) {
                        animal.removeRider(this);
                    }
                    animal = (Animal) item;
                    animal.addRider(this);
                    break;
                case SUPPLIES_DROP:
                    // randomly add weapons and items to player's inventory
                    Random random = new Random();
                    int numWeapons = random.nextInt(3) + 1;
                    int numItems = random.nextInt(5) + 1;
                    for (int i = 0; i < numWeapons; i++) {
                        int weaponIndex = random.nextInt(weaponsList.size());
                        addWeapon(weaponsList.get(weaponIndex));
                    }
                    for (int i = 0; i < numItems; i++) {
                        int itemIndex = random.nextInt(itemsList.size());
                        addItem(itemsList.get(itemIndex));
                    }
                    break;
            }
        }

        void takeDamage(int damage) {
            health -= damage;
            if (health < 0) {
                health = 0;
            }
        }
    }

    //weapon class
    class Weapon {
        String name;
        int damage;

        Weapon(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }
    }

    //item class
    abstract class Item {
        String name;
        ItemType type;
        int value;

        Item(String name, ItemType type, int value) {
            this.name = name;
            this.type = type;
            this.value = value;
        }
    }

    //vehicle class
    class Vehicle extends Item {
        ArrayList<Player> passengers;

        Vehicle(String name, int value) {
            super(name, ItemType.VEHICLE)
