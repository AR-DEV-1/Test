public class BrokenStructure extends Structure {
    private boolean isDestroyed;

    public BrokenStructure(String name, int health, boolean isDestroyed) {
        super(name, health);
        this.isDestroyed = isDestroyed;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setDestroyed(boolean destroyed) {
        isDestroyed = destroyed;
    }
}
public class BrokenStructure extends Structure {
    private boolean isDestroyed;

    public BrokenStructure(String name, int health, boolean isDestroyed) {
        super(name, health);
        this.isDestroyed = isDestroyed;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setDestroyed(boolean destroyed) {
        isDestroyed = destroyed;
    }

    public void repair(int amount) {
        if (isDestroyed) {
            health += amount;
            if (health >= maxHealth) {
                health = maxHealth;
                isDestroyed = false;
            }
        }
    }
}
