String[] splashes = {
    "Welcome to War Bound!",
    "Get ready to battle!",
    "Survive at all costs!",
    "Explore new worlds!",
    "Have fun!"
  "Made by Chat GPT and AR-DEV-1!",
      "ar-dev-1.github.io/WarBound!",
  
      
};
int randomSplash = (int) (Math.random() * splashes.length);
JLabel splashLabel = new JLabel(splashes[randomSplash]);
// Generate and display a new splash every 15 seconds
while (true) {
    Thread.sleep(10000);
    int randomSplash = (int) (Math.random() * splashes.length);
    splashLabel.setText(splashes[randomSplash]);
}

