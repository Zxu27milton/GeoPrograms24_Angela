public class A1_HowToMove extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 2;
        plane.teleport(50,500);
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.turn(60);
        plane.move(300);
        plane.isTrail = true;
        plane.turn(240);
        plane.move(300);
        plane.isTrail = false;
        plane.turn(180);
        plane.move(150);
        plane.isTrail = true;
        plane.turn(60);
        plane.move(150);

    }

}

