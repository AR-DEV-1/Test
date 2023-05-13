// Example code for creating a game world using JavaFX

public class GameWorld extends Group {

    private final int tileSize = 32;
    private final int rows = 10;
    private final int cols = 10;
    private final Tile[][] tiles = new Tile[rows][cols];

    public GameWorld() {
        // Generate random obstacles
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                boolean hasObstacle = Math.random() < 0.2;
                if (hasObstacle) {
                    tiles[row][col] = new Tile(TileType.OBSTACLE);
                } else {
                    tiles[row][col] = new Tile(TileType.GRASS);
                }
                tiles[row][col].setTranslateX(col * tileSize);
                tiles[row][col].setTranslateY(row * tileSize);
                getChildren().add(tiles[row][col]);
            }
        }
    }
}

public enum TileType {
    GRASS,
    OBSTACLE
}

public class Tile extends Rectangle {

    private final TileType type;

    public Tile(TileType type) {
        this.type = type;

        switch (type) {
            case GRASS:
                setFill(Color.GREEN);
                break;
            case OBSTACLE:
                setFill(Color.DARKGRAY);
                break;
        }

        setWidth(32);
        setHeight(32);
    }

    public TileType getType() {
        return type;
    }
}
