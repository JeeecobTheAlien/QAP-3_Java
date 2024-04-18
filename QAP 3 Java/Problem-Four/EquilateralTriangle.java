public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        // Assuming that Triangle class has a constructor that accepts six parameters
        super(0, 0, side, 0, side / 2, (Math.sqrt(3) / 2) * side);
    }

    @Override
    public String toString() {
        return "EquilateralTriangle [side=" + getSide() + "]";
    }

    // Assuming that Triangle class has methods getX1(), getX2(), getY1(), getY2()
    public double getSide() {
        // Assuming the side length is calculated based on the distance between two points of the triangle
        double side = Math.sqrt(Math.pow(getX2() - getX1(), 2) + Math.pow(getY2() - getY1(), 2));
        return side;
    }
}
