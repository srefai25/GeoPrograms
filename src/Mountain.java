public class Mountain extends World {

    public void go(){
        plane.isTrail = true;
        moon();

    }

    public void moon(){
     plane.square(100);
     sun();
    }

    public void sun(){
        plane.teleport(200,200);
       plane.triangle(200);
       light();
    }

    public void light(){
        plane.move(300);
    }

    public void triangle(){
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(255, 215, 200);
        plane.move(200);
        plane.turn(120);
        plane.setColor(48, 213, 200);
        plane.move(200);
        plane.turn(120);
        plane.setColor(143, 0, 255);
        plane.move(200);
        square();
    }

    public void square(){
        plane.startingAngle(0);
        plane.setColor(255, 215, 200);
        plane.move(200);
        plane.turn(270);
        plane.setColor(212, 250, 217);
        plane.move(200);
        plane.turn(270);
        plane.setColor(212, 213, 250);
        plane.move(200);
        plane.turn(270);
        plane.setColor(250, 212, 223);
        plane.move(200);
        bigsquare(100);
    }

    public void bigsquare(int length){
        plane.startingAngle(0);
        plane.setColor(255, 215, 200);
        plane.move(length);
        plane.turn(270);
        plane.setColor(212, 250, 217);
        plane.move(length);
        plane.turn(270);
        plane.setColor(212, 213, 250);
        plane.move(length);
        plane.turn(270);
        plane.setColor(250, 212, 223);
        plane.move(300);
    }

    public void house(){
        triangle();
        plane.turn(270);
        square();
    }
}
