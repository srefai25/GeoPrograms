public class B3_HalfTheRed extends World {
    public int red;//variable of type int
    public int blue;//same for this
    public int green;//same for this

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();//method that shows a picture (file name found on line 12 of run my program)
        System.out.println(plane.howMuchRed());//howMuchRed is a method that tells us the "r" value of the color

        for (int row = 182; row < 195; row = row + 1) {
            for (int col = 36; col < 79; col++) {//x=x+1 is the same as x++ & x+=1
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();//howMuchGreen is how much green is in the color
                blue = plane.howMuchBlue();//howMuchBlue is how much blue is in the color
//                plane.teleport(col, 488 - row);
                plane.setPixelColor(red * 2, green * 2, blue / 2);//divided the amount of red in half while green and blue stay the same
            }
        }
        circle();
    }

    public void circle() {
        for(int row=149; row<205; row=row+1){
            for(int column=4; column<87; column=column+1){
                plane.teleport(column,row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();//howMuchGreen is how much green is in the color
                blue = plane.howMuchBlue();//howMuchBlue is how much blue is in the color
                //if the pants are red, then make it purple
                if(blue<75 && green<70 && red>100){
                    plane.setPixelColor(222, 160, 235);
                }
            }
        }
    }
}




/* 

// Below is a list of the variables in plane and how to set them:

   plane.anglefacing=90 ;     // Sets the angle the plane is facing
	plane.xpos=100;            // Sets the xposition of the plane
	plane.ypos=100;            // Sets the yposition of the plane
   plane.isTrail=false;       // Sets if the plane has a trail
   plane.trailWidth=1;        // Sets the width of the trail from the plane
   plane.pausetime=1;         // Sets how long the plane pauses each time it moves, 
                                 make this bigger to watch the drawing happen
   
// Below are all the methods the plane can use:

   System.out.println("fun" + variable);  // Prints text to the window + the value of the variable
   plane.drawWords("this is fun");  // Prints text to the applet at the location of the plane
   plane.circle(10);                // Draws a circle of radius 10
   plane.square(50);                // Draws a square with side length 50, 
                                      the plane finishes in the same direction it starts  
   plane.house(100);                // Draws a house with a bottom edge of 100
   plane.fillCircle(100);           // Draws a circle of radius 100 and fills it in
   plane.move(100);                 // Moves the plane forward (the direction it is facing) 100 pixels
   plane.teleport(111, 222);        // Relocates the plan to the x position 111 and the y position 222, 
                                      there is no trail with teleport
   plane.turn(90);                  // Turns the plan 90 degrees counterclockwise
   plane.setColor(255, 255, 255);   // Sets the trail color Red, Green, Blue; max value of 255, min 0
   plane.setPixelColor(255, 255, 255);  // Sets the pixel color at the plane's location to Red, Green, Blue; max value of 255, min 0
   plane.howMuchBlue();             // Returns a number between 0 and 255 describing how much blue there is
   plane.howMuchGreen();            // Returns a number between 0 and 255 describing how much green there is
   plane.howMuchRed();              // Returns a number between 0 and 255 describing how much red there is
   plane.random(0, 100);            // Returns an integer on the interval 0 to 99
   
*/