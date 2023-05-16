public class Player {
    private String playerName;
    private String skinFilePath;

    // Constructor, getters, and setters

    public void setSkin(String skinFilePath) {
        this.skinFilePath = skinFilePath;
    }

    public void resetSkin() {
        this.skinFilePath = null;
    }

}
