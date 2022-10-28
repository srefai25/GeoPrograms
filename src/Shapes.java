public class Shapes extends World {
    public void go() {
        plane.isTrail = true;
        S(1);

    }

    public void square(int length, int degree) {
        plane.move(length);
        plane.turn(degree);
        plane.move(length * 2);
        plane.turn(degree);
        plane.move(length);
        plane.turn(degree);
        plane.move(length * 2);
    }

    public void S(int length) {
        plane.teleport(500, 500);
        plane.startingAngle(0);
        plane.move(length * 20);
        plane.turn(90);
        plane.move(length * 20);
        plane.turn(90);
        plane.move(length * 20);
        plane.turn(270);
        plane.move(length * 20);
        plane.turn(270);
        plane.move(length * 20);
    }


}

