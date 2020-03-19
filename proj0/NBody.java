/**
 * NBody
 */
public class NBody {

    public static double readRadius(String datafile) {
        In in = new In(datafile);

        in.readInt();
        double radius = in.readDouble();
        
        return radius;
    }

    public static Body[] readBodies(String datafile) {
        In in = new In(datafile);
        int number = in.readInt();
        Body bodies[] = new Body[number];
        in.readDouble();
        for (int i = 0; i < number; i++) {
            bodies[i] = new Body(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString()); 
        }

        return bodies;
    }

    private static void drawBackground(double radius, String imgfile) {
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(-1 * radius, radius);
        StdDraw.clear();
        StdDraw.picture(0, 0, imgfile);
        StdDraw.show();
    }

    private static void drawBodie(Body[] bodies) {
        for (Body body : bodies) {
            body.draw();
        }
    }

    public static void main(String[] args) {
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        Body[] bodies = readBodies(filename);
        double radius = readRadius(filename);
        drawBackground(radius, "images/starfield.jpg");
        drawBodie(bodies);
    }
}