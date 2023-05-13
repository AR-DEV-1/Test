// Example code for creating tank objects using JavaFX

public class Tank extends Group {

    private final Rectangle body;
    private final Rectangle turret;
    private final Circle barrel;
    private final int health;

    public Tank(int health) {
        this.health = health;

        // Create tank body
        body = new Rectangle(32, 48);
        body.setFill(Color.GRAY);

        // Create tank turret
        turret = new Rectangle(20, 32);
        turret.setFill(Color.WHITE);
        turret.setTranslateX(6);
        turret.setTranslateY(-
