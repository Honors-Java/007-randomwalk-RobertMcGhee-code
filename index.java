//Put all your variables up here outside the setup or draw functions
//What variables may you want?
//  x, y, number of steps to take, and current steps taken

int n = 300;
int steps = 0;
int x = 200;
int y = 200;
//int limit = 300;
int rx = 0;
int ry = 0;

void setup() {
	size(500, 500);
  frameRate(10);
}

void draw() {
	fill(255);
  stroke(1);
  //starts random walking from 200,200
  //fill(0, 0, 255);
  if(steps >= n){
    steps = n;
    x = x;
    y = y;
  }else{
    rect(x, y, 10, 10);
    steps++;
    rx = (int)(Math.random() * 10);
    ry = (int)(Math.random() * 10);
    if(rx >= 5){
      x = x + 10;
      rect(x, y, 10, 10);
    }else{
      x = x - 10;
      rect(x, y, 10, 10);
    }
    if(ry >= 5){
      y = y + 10;
      fill(0, 0, 255);
      rect(x, y, 10, 10);
      steps++;
    }else{
      y = y - 10;
      fill(0, 0, 255);
      rect(x, y, 10, 10);
      steps++;
    }
  }
    
    //rect(x, y, 10, 10);
    //steps++
      //if(ry >= 5){
        //y = y + 10;
      //}else{
        //y = y - 10;
      //}
  //Here is where you should create the new rectangles to create the illusion of 'random walking'
  // You will need to make sure you dont draw more rectangles than the limit of steps
  //You'll need to use the Math.random() to decide how to create randomness in your drawing of rectangles.
  // Keep your canvas and rectangle width and height as I've given you

 
    
    println("drew rect at: " + x + ", " + y);
    println("Steps taken: " + steps);
}



	



