public class B2_TeachMeNestedLoops extends World {

   public void go() {
      System.out.println("This will be printed to the  window. ");
      plane.teleport(0, 0);
      plane.pausetime = 0;


//      for (int y = 0; y < 800; y = y + 1) {
//         for (int x = 0; x < 1000; x = x + 1) {
//            plane.teleport(x, y);
//            plane.setPixelColor((1000-x)/4, 50, 200);
//            System.out.println("x: " + x);
////         }
////
////      }

//
      int squareSize = 5;
      int planeHeight = 800;
      int planeWidth = 1000;
      // This outer for loop will repeat the inner loop
      for (int y = 0; y < (int)(planeHeight/squareSize); y = y + 1) {
         // This inner for loop repeats the teleport and the setPixelColor
         for (int x = 0; x < (int)(planeWidth/squareSize); x = x + 1) {
            plane.trailWidth = 50;
            plane.setColor((int)(255/(planeWidth/squareSize) * x), (int) (255/(planeHeight/squareSize) * y), 200);
            plane.teleport(x * squareSize, y * squareSize);
            plane.square(squareSize);
            System.out.println("x: " + x);
            }
         }
   }
}




