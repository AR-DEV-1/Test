public class Player {
    private List<Achievement> achievements;

    // Constructor, getters, and setters

    public void unlockAchievement(Achievement achievement) {
        achievement.setUnlocked(true);
        achievements.add(achievement);
    }
}
