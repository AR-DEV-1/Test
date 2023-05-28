// Array of text splash data
var splashes = [
  { heading: "Welcome to War Bound!", text: "Get ready to battle!" },
  { heading: "Survive at all costs!", text: "Explore new worlds!" },
  { heading: "Have fun!", text: "Made by Chat GPT and AR-DEV-1!" }
  { heading: "Now on Github!", text: "ar-dev-1.github.io/WarBound!" }
];

// Get references to splash elements
var splashHeading = document.getElementById("splash-heading");
var splashText = document.getElementById("splash-text");

// Function to change the text splash
function changeSplash(index) {
  var splash = splashes[index];
  splashHeading.textContent = splash.heading;
  splashText.textContent = splash.text;
}

// Initial splash index
var currentSplashIndex = 0;

// Change splash every 5 seconds
setInterval(function() {
  changeSplash(currentSplashIndex);
  currentSplashIndex = (currentSplashIndex + 1) % splashes.length;
}, 3000);
     
