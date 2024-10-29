/**
 * Version Lockwood 2024
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new C2_FreeDrawMethods());
        run.planeIcon = "plane.png";
        run.pictureFileName="AdventureTime.png";
////          HALF THE RED
//        run.HEIGHT=500;
//        run.WIDTH=900;

//        YEXUAN PIXEL
        run.HEIGHT=900;
        run.WIDTH = 500;
        run.Refresh();

    }
}
