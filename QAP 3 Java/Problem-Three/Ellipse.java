public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double getPerimeter() {
        // You might want to use an approximation for the perimeter
        // or use numerical methods for a more accurate result.
        // For simplicity, let's return an approximation using Ramanujan's formula.
        double h = Math.pow(majorAxis - minorAxis, 2) / Math.pow(majorAxis + minorAxis, 2);
        return Math.PI * (majorAxis + minorAxis) * (1 + 3 * h / (10 + Math.sqrt(4 - 3 * h)));
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}


// public class Ellipse extends Shape {
//     private double majorAxis;
//     private double minorAxis;

//     public Ellipse(double majorAxis, double minorAxis) {
//         super("Ellipse");
//         this.majorAxis = Math.max(majorAxis, minorAxis);
//         this.minorAxis = Math.min(majorAxis, minorAxis);
//     }

//     @Override
//     public double getPerimeter() {
//         double a = majorAxis;
//         double b = minorAxis;
//         double semiPerimeter = (a + b + Math.sqrt((a - b) * (a - b) + 4 * a * b)) / 2;
//         return Math.PI * semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) / a;
//     }

//     @Override
//     public double getArea() {
//         return Math.PI * majorAxis * minorAxis;
//     }
// }