public class Point {

    private double x; // Instance Variables
    private double y;

    public Point() { // defultt (0,0)
        this.x = 0; // instance varb this.wtv
        this.y = 0;
    }

    Point(double x, double y) { // parameter for setting cord.
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;

    }

    public double getY() {
        return y;

    }

    public Point difference(Point point) { // Point: class point: parameter
        return new Point(this.x - point.x, this.y - point.y);
    }

    public void displayCoordinate() {
        System.out.println("The x-coordinate is: " + this.x);
        System.out.println("The y-coordinate is: " + this.y);
    }

    public double distance(Point point) {
        double dx = this.x - point.x;
        double dy = this.y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void linearEquation(Point point) {
        double m = slope(point);
        double b = y - m * x;
        System.out.println("The equation of the line is: y = " + m + "x + " + b);
    }

    public Point midpoint(Point point) {
        return new Point((this.x + point.x) / 2, (this.y + point.y) / 2);
    }

    public double slope(Point point) {
        if (this.x == point.x) {
            throw new ArithmeticException("Slope is undefined (vertical line)");
        }
        return (point.y - this.y) / (point.x - this.x);
    }

    public Point sum(Point point) {
        return new Point(this.x + point.x, this.y + point.y);
    }

    public double yIntercept(Point point) {
        double m = slope(point);
        return this.y - m * this.x;
    }
}