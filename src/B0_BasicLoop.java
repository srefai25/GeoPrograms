public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.trailWidth = 50;
        plane.pausetime = 1;
        squareGrid();

    }
    public void squareGrid(){
        for(int row=0; row<8; row=row+1){
            squareRow(row);
        }

    }

    public void squareRow (int row){
        for(int column=0;column<10;column=column+1) {
            plane.setColor(row*25,100,column*25);
            plane.teleport(column*50,row*50);
            System.out.println(column);
            plane.square(50);
        }

        }
    }

