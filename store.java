import java.util.Scanner;

public class Store {
    private int coins;
    private int[] weapons = {50, 100, 150, 200}; // prices for each weapon
    private String[] weaponNames = {"Pistol", "Shotgun", "Assault Rifle", "Sniper Rifle"}; // names for each weapon
    private int[] upgrades = {25, 50, 75, 100}; // prices for each upgrade
    private String[] upgradeNames = {"Increased Ammo Capacity", "Improved Reload Speed", "Better Accuracy", "Faster Movement Speed"}; // names for each upgrade
    private int[] items = {10, 20, 30, 40}; // prices for each item
    private String[] itemNames = {"Health Kit", "Armor Plate", "Grenade", "Smoke Bomb"}; // names for each item
    
    public Store(int startingCoins) {
        coins = startingCoins;
    }
    
    public void displayMenu() {
        System.out.println("Welcome to the Store!");
        System.out.println("You have " + coins + " coins.");
        System.out.println("1. Weapons");
        System.out.println("2. Upgrades");
        System.out.println("3. Items");
        System.out.println("4. Buy Coins");
        System.out.println("5. Exit Store");
        System.out.println("Enter the number of the option you would like to select:");
    }
    
    public void displayWeapons() {
        System.out.println("Weapons for Sale:");
        for (int i = 0; i < weapons.length; i++) {
            System.out.println((i + 1) + ". " + weaponNames[i] + " (" + weapons[i] + " coins)");
        }
        System.out.println("Enter the number of the weapon you would like to buy:");
    }
    
    public void displayUpgrades() {
        System.out.println("Upgrades for Sale:");
        for (int i = 0; i < upgrades.length; i++) {
            System.out.println((i + 1) + ". " + upgradeNames[i] + " (" + upgrades[i] + " coins)");
        }
        System.out.println("Enter the number of the upgrade you would like to buy:");
    }
    
    public void displayItems() {
        System.out.println("Items for Sale:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + itemNames[i] + " (" + items[i] + " coins)");
        }
        System.out.println("Enter the number of the item you would like to buy:");
    }
    
    public void buyCoins() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of coins you would like to buy:");
        int coinsToAdd = scanner.nextInt();
        coins += coinsToAdd;
        System.out.println("You now have " + coins + " coins.");
    }
    
    public boolean buyWeapon(int weaponNumber) {
        int weaponIndex = weaponNumber - 1;
        if (weaponIndex >= 0 && weaponIndex < weapons.length) {
            if (coins >= weapons[weaponIndex]) {
                coins -= weapons[weaponIndex];
                System.out.println("You bought a " + weaponNames[weaponIndex] + ".");
                return true;
            } else {
                System.out.println("You do not have enough coins to buy a " + weaponNames[weaponIndex] + ".");
                return false;
            }
        } else {
            System.out.println("Invalid weapon number.");
            return false;
