@Override
public void scale(double factor) {
    double centerX = (x1 + x2 + x3) / 3.0;
    double centerY = (y1 + y2 + y3) / 3.0;

    // Translate points to the origin
    x1 -= centerX;
    y1 -= centerY;
    x2 -= centerX;
    y2 -= centerY;
    x3 -= centerX;
    y3 -= centerY;

    // Scale distances from the origin
    x1 *= factor;
    y1 *= factor;
    x2 *= factor;
    y2 *= factor;
    x3 *= factor;
    y3 *= factor;

    // Translate points back to their original positions
    x1 += centerX;
    y1 += centerY;
    x2 += centerX;
    y2 += centerY;
    x3 += centerX;
    y3 += centerY;
}


// public class Triangle implements Scalable {
//     private double x1;
//     private double y1;
//     private double x2;
//     private double y2;
//     private double x3;
//     private double y3;

//     public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
//         this.x1 = x1;
//         this.y1 = y1;
//         this.x2 = x2;
//         this.y2 = y2;
//         this.x3 = x3;
//         this.y3 = y3;
//     }

//     @Override
//     public void scale(double factor) {
//         this.x1 *= factor;
//         this.y1 *= factor;
//         this.x2 *= factor;
//         this.y2 *= factor;
//         this.x3 *= factor;
//         this.y3 *= factor;
//     }

//     @Override
//     public String toString() {
//         return "Triangle [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", x3=" + x3 + ", y3=" + y3 + "]";
//     }
// }