public class C2_FreeDrawMethods     extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.trailWidth = 2;
        plane.pausetime = 0;
        plane.loadBackGround("hlr 2.jpg");
        for (int y = 0; y < 900; y = y + 1) {
            for (int x = 0; x < 500; x = x + 1) {
                hlrpixelated(x, y);

            }
        }
    }

    public void hlrflipeffect(int x, int y) {
//               CODE FOR FLIP THE IMAGE ACROSS Y AXIS
                  plane.teleport(x, y);
                  red = plane.howMuchRed();
                  green = plane.howMuchGreen();
                  blue = plane.howMuchBlue();
//                    The purpose of the red = plane.howMuchRed etc is to pick the color at that specific pixel
                  plane.teleport(500 - x, y);
                  plane.setPixelColor(red, green, blue);
    }

    public void hlrdigitaleffectsquare(int x, int y) {
        plane.teleport(3 * x, 3 * y);
//        CODE FOR DIGITAL EFFECT SQUARE
        red = plane.howMuchRed();
        green = plane.howMuchGreen();
        blue = plane.howMuchBlue();
        plane.teleport(3 * x, 3 * y);
        plane.setColor(red, green, blue);
        plane.square(1);

    }

    public void hlrinversegradient(int x, int y) {
        plane.teleport (x,y);
        red = plane.howMuchRed();
        green = plane.howMuchGreen();
        blue = plane.howMuchBlue();
        plane.setPixelColor(Math.abs(red-(int)(x/2)), Math.abs(green-(int)(y/3.6)), blue);
    }

    public void hlrpixelated(int x, int y) {
        plane.teleport(x, y);
//        CODE FOR DIGITAL EFFECT SQUARE
        red = plane.howMuchRed();
        green = plane.howMuchBlue();
        blue = plane.howMuchBlue();
        plane.teleport(500 - (x), y);
        plane.setPixelColor(red, green, blue);
        if (y > 400 && y < 600) {
            plane.square(1);
            plane.setColor(red, green, blue);
        }
        if (y >= 600 && y < 750) {
            plane.square(3);
            plane.setColor(red, green, blue);
        }
        if (y >= 750 && y <= 900) {
            plane.square(9);
            plane.setColor(red, green, blue);
        }
    }
}