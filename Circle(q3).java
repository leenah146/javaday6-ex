public class Circle implements GeometricObject {

    protected double Radius;

    public Circle(double radius) {
        Radius = radius;
    }



    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                '}';
    }
}
