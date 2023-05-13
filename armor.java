public class Armor {
    private String name;
    private int defenseValue;
    private int durability;

    public Armor(String name, int defenseValue, int durability) {
        this.name = name;
        this.defenseValue = defenseValue;
        this.durability = durability;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    // Other methods for equipping and unequipping armor
}
