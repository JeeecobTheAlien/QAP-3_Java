public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(1, 2, 3);
        System.out.println("Before scaling: " + circle);
        scale(new Scalable[] { circle }, 2);
        System.out.println("After scaling: " + circle);

        Ellipse ellipse = new Ellipse(1, 2, 3, 4);
        System.out.println("Before scaling: " + ellipse);
        scale(new Scalable[] { ellipse }, 2);
        System.out.println("After scaling: " + ellipse);

        Triangle triangle = new Triangle(1, 2, 3, 4, 5, 6);
        System.out.println("Before scaling: " + triangle);
        scale(new Scalable[] { triangle }, 2);
        System.out.println("After scaling: " + triangle);

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(1);
        System.out.println("Before scaling: " + equilateralTriangle);
        scale(new Scalable[] { equilateralTriangle }, 2);
        System.out.println("After scaling: " + equilateralTriangle);
    }

    public static void scale(Scalable[] arr, double factor) {
        for (Scalable s : arr) {
            s.scale(factor);
        }
    }
}