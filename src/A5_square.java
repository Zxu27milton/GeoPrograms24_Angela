public class A5_square extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);
        plane.startingAngle(90);
        plane.teleport(400,400);
        polygon(100);



    }

    public void polygon(int nSides) {
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        // plane.trailWidth = plane.random(5,10);
        int distance = nSides/5;
        plane.setColor(120,198, 207);
        for(int x=0; x<nSides; x=x+1) {
            plane.move(distance);
            plane.turn((180-((nSides-2)*180)/nSides));
            System.out.println(x);
        }
    }

    public void triangle(int side) {
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.move(side);
        plane.turn(120);
        plane.move(side);
        plane.turn(120);
        plane.move(side);
    }


    public void square(int side) {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
            for (int x = 0; x < 4; x = x + 1) {
                plane.move(side);
                plane.turn(90);
                System.out.println(x);
            }
        }
    }



