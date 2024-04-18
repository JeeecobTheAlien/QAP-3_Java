public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(6, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(7);

            for (Shape shape : shapes) {
                System.out.println("Shape: " + shape.getName());
                System.out.println("Perimeter: " + shape.getPerimeter());
                System.out.println("Area: " + shape.getArea());
                System.out.println();
        }
    } 
}