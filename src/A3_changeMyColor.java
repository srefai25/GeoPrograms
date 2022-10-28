

public class A3_changeMyColor extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(255, 255, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(255, 255,0);
        plane.move(100);
        plane.turn(132);
        plane.setColor(255, 255, 0);
        plane.move(140);
    }


}
