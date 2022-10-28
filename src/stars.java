public class stars extends World {
    public void go() {
        plane.isTrail = true;
        plane.startingAngle(60);
        plane.teleport(200, 200);
        turquioise();
    }

    public void turquioise() {
        plane.startingAngle(70);
        plane.trailWidth = 5;
        plane.setColor(176, 235, 227);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(65);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        blue();
    }

    public void blue() {
        plane.startingAngle(70);
        plane.trailWidth = 5;
        plane.teleport(250, 250);
        plane.startingAngle(70);
        plane.trailWidth = 5;
        plane.setColor(194, 215, 242);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(65);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        violet();
    }
    public void violet() {
        plane.startingAngle(70);
        plane.trailWidth = 5;
        plane.teleport(300, 300);
        plane.startingAngle(70);
        plane.trailWidth = 5;
        plane.setColor(207, 187, 242);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(65);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        pink();
    }
    public void  pink() {
        plane.startingAngle(70);
        plane.trailWidth = 5;
        plane.teleport(350, 350);
        plane.startingAngle(70);
        plane.trailWidth = 5;
        plane.setColor(251, 204, 252);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(65);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        red();
    }
    public void  red() {
        plane.startingAngle(70);
        plane.trailWidth = 5;
        plane.teleport(400, 400);
        plane.startingAngle(70);
        plane.trailWidth = 5;
        plane.setColor(237, 102, 154);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(65);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
        plane.turn(225);
        plane.move(100);
        plane.turn(75);
        plane.move(100);
    }
}

