

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(255, 215, 200);
        plane.move(150);
        plane.turn(120);
        plane.setColor(48, 213, 200);
        plane.move(150);
        plane.turn(120);
        plane.setColor(143, 0, 255);
        plane.move(150);


    }


}
