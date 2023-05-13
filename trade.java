public class Player {
    private String name;
    private int gold;
    private List<Item> inventory;

    public Player(String name) {
        this.name = name;
        this.gold = 0;
        this.inventory = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public void addGold(int amount) {
        gold += amount;
    }

    public void removeGold(int amount) {
        gold -= amount;
    }

    public void trade(Player otherPlayer, Item offeredItem, Item desiredItem, int offeredGold, int desiredGold) {
        if (inventory.contains(offeredItem) && otherPlayer.getInventory().contains(desiredItem) && gold >= offeredGold && otherPlayer.getGold() >= desiredGold) {
            inventory.remove(offeredItem);
            otherPlayer.addItem(offeredItem);
            gold -= offeredGold;
            otherPlayer.addGold(offeredGold);
            otherPlayer.getInventory().remove(desiredItem);
            addItem(desiredItem);
            otherPlayer.removeGold(desiredGold);
            addGold(desiredGold);
            System.out.println(name + " traded " + offeredItem.getName() + " for " + desiredItem.getName() + " with " + otherPlayer.getName() + ".");
        } else {
            System.out.println("Trade unsuccessful.");
        }
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public int getGold() {
        return gold;
    }

    public String getName() {
        return name;
    }
}

public class Item {
    private String name;
    private int value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
