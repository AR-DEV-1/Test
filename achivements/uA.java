// Example code for unlocking an achievement when the player reaches a certain level
if (player.getLevel() >= 10) {
    Achievement level10Achievement = new Achievement("Level 10", "Reach level 10");
    player.unlockAchievement(level10Achievement);
}
