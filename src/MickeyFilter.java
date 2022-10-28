public class MickeyFilter extends World{

    public int red;//variable of type int
    public int blue;
    public int green;

    public void go(){
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();//method that shows a picture (file name found on line 12 of run my program)

        shoefilter();
    }

    public void shoefilter(){
        for (int row=500;row<680;row=row+1){//rows
            for (int column=50;column<430;column=column+1){//columns
                plane.teleport(column,row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();//howMuchGreen is how much green is in the color
                blue = plane.howMuchBlue();//howMuchBlue is how much blue is in the color
                //if the color is yellow, change color to pink
                if (blue<100 && green>190 && red>200){
                    plane.setPixelColor(255, 192, 203);
                }
            }
        }
        pantfilter();
    }

    public void pantfilter(){
        for(int row=340; row<520; row=row+1){
            for(int column=115; column<330; column=column+1){
                plane.teleport(column,row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();//howMuchGreen is how much green is in the color
                blue = plane.howMuchBlue();//howMuchBlue is how much blue is in the color
                //if the pants are red, then make it purple
                if(blue<75 && green<70 && red>100){
                    plane.setPixelColor(222, 160, 235);
                }
                if (blue<75 && green<70 && red>100 && blue>6){
                    plane.setPixelColor(177, 134, 186);
                }

            }
        }

    }
};


