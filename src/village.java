

public class village extends World {
    public void go() {
        plane.pausetime = 2;
        flower();
    }

    public void flower() {
        plane.isTrail = true;
        plane.startingAngle(270);
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
        plane.trailWidth = 40;
        plane.move(10);
        plane.startingAngle(270);
        plane.move(50);
        plane.move(90);
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
        plane.square(50);
        plane.startingAngle(360);
        plane.square(50);
        plane.startingAngle(270);
        plane.move(50);
        plane.turn(270);
        plane.move(25);
        plane.turn(90);
        plane.square(50);
        rock();
    }
    public void rock(){
        plane.teleport(100, 250);
        plane.setColor(133, 133, 133);
        plane.square(50);
        house();
    }

    public void house (){
        plane.startingAngle(90);
        plane.teleport(500, 150);
        plane.trailWidth = 20;
        plane.setColor(plane.random(70,90), plane.random(60,70), plane.random(60, 80));
        plane.house(250);
        smile();
    }

    public void smile(){
        plane.teleport(300, 500);
        plane.trailWidth = 20;
        for(int x=0;x<5;x=x+1)
        {
            System.out.println(x);
            plane.move(25);
            plane.turn(180);
            plane.move(100);

        }
        int x = plane.random(1,3);

        if (x == 1){
            rock();
        }

        if (x == 2){
            house();
        }

        if (x == 3){
            flower();
        }
    }


}

