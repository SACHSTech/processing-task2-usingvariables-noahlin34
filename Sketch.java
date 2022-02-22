import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	    //the sun
      fill(255, 255, 0);
      ellipse(width, height/15, width/3, height/3);
  
      //draws the ground
      fill(150, 75, 0);
      rect(width*0, height-height/4, width, height/3);
  
      //base of the house
      fill(255, 0, 0);
      square(width/4, height/3, width/2);
  
      //draws the roof
      fill(212, 175, 55);
      triangle(width/4, height/3, width/2, height/9, width/4 + width/2, height/3);
  
      //draws a door on "top" of the house
      fill(34, 139, 34);
      rect(width/2, height/2, width/5, height/3);


    
  }
  
  // define other methods down here.
}