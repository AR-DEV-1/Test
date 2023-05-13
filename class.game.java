public class Game {
    // Existing code omitted for brevity
    
    public static void main(String[] args) {
        // Existing code omitted for brevity
        
        while (running) {
            // Existing code omitted for brevity

            // Handle user input
            switch (input.nextLine().toLowerCase()) {
                case "w":
                    player.moveUp();
                    break;
                case "a":
                    player.moveLeft();
                    break;
                case "s":
                    player.moveDown();
                    break;
                case "d":
                    player.moveRight();
                    break;
                case "1":
                    player.switchWeapon(0);
                    break;
                case "2":
                    player.switchWeapon(1);
                    break;
                case "3":
                    player.switchWeapon(2);
                    break;
                case "r":
                    player.reload();
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    break;
            }
        }
    }
}
