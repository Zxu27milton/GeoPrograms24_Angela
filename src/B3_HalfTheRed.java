public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void classworkdraw() {
        plane.loadBackGround("AdventureTime.png");
        plane.showBackGround();
//        for (int y = 0; y < 800; y = y + 1) {
//            for (int x = 0; x < 1000; x = x + 1) {
        for (int x = 400; x < 530; x = x + 1) {
//                    Circling out a specific region that we want to change
            for (int y = 120; y < 170; y = y + 1) {
                plane.teleport(x,y);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red < 120 && green < 120 && blue < 120) {
                    plane.setPixelColor(247, 204, 236);
//                plane.setPixelColor(red, green, blue);
//                plane.teleport(x, y);
//                if (red == 134 && green == 196 && blue == 217) {
//                if (red<160 && red>120 && green<220 && green>180 && blue>195 && blue<240)
////                    Filtering a certain color to turn another color
////                    The reason why we use two == is because we are asking a question right now.
////                    *It is an if condition instead of a statement to set red as that color.
//                    plane.setPixelColor(220, 100, 217);
//                if (red<100 && green<100 && blue<100) {
//                    //Change the black colors into pink, do less than or equal to by typing <=
//                    plane.setPixelColor(247, 204, 236);
                        }
                    }
                }
            }
        }
