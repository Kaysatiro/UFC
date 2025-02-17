public class Rectangle implements Shape {
    String name = "Rect";
    Point2D p1;
    Point2D p2;
    double largura, altura;

    public Rectangle(Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.altura = p1.y - p2.y;
        this.largura = p1.x - p2.x;
    }

    public String getName() {
        return this.name;
    }
    public double getArea() {
        return this.largura * this.altura;
    }

    public double getPerimeter() {
        return 2 * (this.largura + this.altura) * (-1);
    }

    public String toString() {
        return this.name + ": P1=" + this.p1 + " P2=" + this.p2;
    }
}