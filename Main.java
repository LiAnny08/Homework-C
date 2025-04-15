public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1, 2); // obj
        Point p2 = new Point(3, 4);

        System.out.println("Point 1:");
        p1.displayCoordinate();
        System.out.println("Point 2:");
        p2.displayCoordinate();

        double distance = p1.distance(p2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);

        Point midpoint = p1.midpoint(p2);
        System.out.println("Midpoint between Point 1 and Point 2:");
        midpoint.displayCoordinate();

        try {
            double slope = p1.slope(p2);
            System.out.println("Slope between Point 1 and Point 2: " + slope);
        } catch (ArithmeticException uhoh) {
            System.out.println(uhoh.getMessage());
        }

        p1.linearEquation(p2);
    }
}