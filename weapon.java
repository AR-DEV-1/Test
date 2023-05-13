public class Weapon {
    private String name;
    private int damage;
    private int ammo;

    public Weapon(String name, int damage, int ammo) {
        this.name = name;
        this.damage = damage;
        this.ammo = ammo;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public void fire() {
        if (ammo > 0) {
            System.out.println("Firing " + name + " for " + damage + " damage.");
            ammo--;
        } else {
            System.out.println("Out of ammo for " + name);
        }
    }
}
