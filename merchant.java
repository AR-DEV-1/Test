public class Merchant {
    private ArrayList<Item> inventory;
    private int money;

    public Merchant(ArrayList<Item> inventory, int money) {
        this.inventory = inventory;
        this.money = money;
    }

    public void sell(Player player, Item item) {
        // code to sell an item to the player and decrease the player's money
    }

    public void buy(Item item) {
        // code to buy an item from the player and increase the merchant's money
    }
}
