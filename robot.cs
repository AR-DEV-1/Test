public class Robot {
    private int health;
    private int attackPower;
    private int movementSpeed;

    public Robot(int health, int attackPower, int movementSpeed) {
        this.health = health;
        this.attackPower = attackPower;
        this.movementSpeed = movementSpeed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    // Other methods for controlling the robot's actions
}
