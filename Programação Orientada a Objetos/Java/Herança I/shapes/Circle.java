public class Circle implements Shape {
    String name = "Circ";
    Point2D center;
    double radius;

    public Circle(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public String getName() {
        return this.name;
    }

    public double getArea() {
        return (this.radius * this.radius) * 3.14159265359;
    }

    public double getPerimeter() {
        return 2 * 3.14159265359 * this.radius;
    }

    public String toString() {
        return "Circ: C=" + this.center + ", R=" + String.format("%.2f", this.radius);
    }
}