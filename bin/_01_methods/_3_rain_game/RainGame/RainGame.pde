/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

/** This program makes a game where the user has to catch rain drops in a bucket
 */


int score = 0;
int bucketWidth = 50;
int bucketHeight;
PImage bUcket;
int y=10;
int x=300;

// The setup method is run once when the program starts
void setup() {
  size(600, 600);


  //Set your canvas size


  //If you are using an image for the bucket, load it and resize it here.
  // A bucket image -  bucket.png - has been provided if you want to use it.

  bUcket= loadImage("bUcket.png");
  bUcket.resize(100, 100);
}

// The draw method runs continuously (in a loop) until the program ends
void draw() {

  // Set a background color
  background(#62969B);

  // Draw a raindrop (ellipse) at the top of the screen
  fill(#4AC2CB);
  ellipse(x, y, 20, 20);


  // Make the rain fall down the screen.
  // Hint: make a variable for the raindrop's Y position and change it after you
  // draw the raindrop

  y+=5;

  // When the rain falls off the bottom of the canvas, 
  // start a new rain drop falling from the top.
  // Each new drop should start at a random position (X position) at the top. 
  // Hint: This code will give you a random number between 0 and the width of your sketch.

  // Draw a bucket (rectangle or image) at the bottom of the screen. 
  // The bucket's width needs to be stored in the bucketWidth variable.
  image (bUcket, mouseX, 500, bucketWidth, 50);

  // Make the bucket move side-to-side with the mouse. Hint: use mouseX

  // When the rain drop has fallen to the bucket, call the checkCatch method
  //  to see if the rain drop is in the bucket.

  checkCatch();
  //This code will display the score on the screen. 
  // Change the color if it does not show up on your background.
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}


// DO NOT CHANGE THIS METHOD - CALL IT FROM THE DRAW METHOD 
void checkCatch() {
  if (x > mouseX && x < mouseX+50) {
    if (y > 500 && y <500+bucketWidth) {
      score++;
      y = 20; //if the food was eaten, make more food fall from the top
      x = (int) random(width-20);
    }
  } else if (y > height &&  score > 0) {
    score--;
    x = (int) random(width);
    y=10;
    println("Your score is now: " + score);
  }
}
