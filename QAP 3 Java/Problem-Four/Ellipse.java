public class Ellipse extends Shape {
    private double x;
    private double y;
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double x, double y, double majorAxis, double minorAxis) {
        this.x = x;
        this.y = y;
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public void scale(double factor) {
        this.majorAxis *= factor;
        this.minorAxis *= factor;
    }

    @Override
    public String toString() {
        return "Ellipse [x=" + x + ", y=" + y + ", majorAxis=" + majorAxis + ", minorAxis=" + minorAxis + "]";
    }
}
