// Example code for displaying the player's earned achievements
for (Achievement achievement : player.getAchievements()) {
    System.out.println("Achievement: " + achievement.getName());
    System.out.println("Description: " + achievement.getDescription());
    System.out.println("Unlocked: " + achievement.isUnlocked());
    System.out.println("-----------------------------");
}
