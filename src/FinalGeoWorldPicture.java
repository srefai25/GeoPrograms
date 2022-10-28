public class FinalGeoWorldPicture extends World{
    public int red;
    public int blue;
    public int green;
    public void go (){
        plane.isTrail = true;
        plane.pausetime = 0;
        plane.showBackGround();
        plane.startingAngle(0);
        cloud();
    }

    public void cloud(){
        for(int x=0;x<2;x=x+1){
            plane.teleport(150,200+x*20);
            plane.setColor(216, 221, 230);
            plane.trailWidth = 40;
            plane.move(300);
        }
        castle();
    }

    public void castle(){
        plane.trailWidth = 20;
        plane.teleport(200,200);
        plane.startingAngle(270);
        plane.setColor(196, 150, 81);
        plane.move(100);
        plane.turn(90);
        plane.move(25);
        plane.turn(230);
        plane.move(45);
        plane.turn(260);
        plane.move(45);
        plane.turn(230);
        plane.move(25);
        plane.teleport(200, 100);
        plane.startingAngle(0);
        plane.move(250);
        plane.turn(270);
        plane.move(100);
        plane.teleport(450, 100);
        plane.startingAngle(270);
        plane.turn(90);
        plane.move(25);
        plane.turn(230);
        plane.move(45);
        plane.turn(260);
        plane.move(45);
        plane.turn(230);
        plane.move(25);
        plane.teleport(360, 100);
        plane.startingAngle(270);
        plane.turn(90);
        plane.move(100);
        plane.turn(230);
        plane.move(110);
        plane.turn(260);
        plane.move(110);
        plane.turn(230);
        plane.move(100);
        coloring();
    }
    public void coloring(){
        plane.teleport(200,200);
        plane.startingAngle(0);
        for(int x=1;x<6;x=x+1){
            plane.move(250);
            plane.teleport(200,200-20*x);
        }
        plane.teleport(200,90);
        plane.move(25);
        plane.teleport(435, 90);
        plane.move(25);
        plane.teleport(280, 90);
        plane.move(110);
        plane.teleport(290, 70);
        plane.move(90);
        plane.teleport(300, 50);
        plane.move(55);
        plane.teleport(310, 30);
        plane.move(25);
        plane.teleport(180, 200);
        plane.startingAngle(270);
        plane.move(100);
        plane.teleport(470, 200);
        plane.startingAngle(270);
        plane.move(100);
        door();
    }
    public void door(){
        plane.teleport(350, 200);
        plane.startingAngle(270);
        plane.setColor(168, 142, 103);
        plane.move(60);
        plane.turn(90);
        plane.move(35);
        plane.turn(90);
        plane.move(60);
        plane.turn(90);
        plane.move(35);
        plane.teleport(315, 180);
        plane.move(35);
        plane.teleport(315, 160);
        plane.move(35);
        if (red>150 && green >100 && blue>100){
            red = plane.howMuchRed();
            green = plane.howMuchGreen();
            blue = plane.howMuchBlue();
            plane.setPixelColor(74, 65, 52);
        }
        ocean();
    }

    public void ocean(){
        if (red>0 && green>0 && blue>0){
            red = plane.howMuchRed();
            green = plane.howMuchGreen();
            blue = plane.howMuchBlue();
            plane.setPixelColor(78, 93, 230);
        }
    }
}

