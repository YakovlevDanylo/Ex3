public class Triangle implements GeometricShape{
    private double a; // first side of triangle
    private double b; // second side of triangle
    private double c; // third side of triangle
    private double p; // half perimeter of triangle

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.p = (b + b + c) / 2;
    }

    @Override
    public double getArea() {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
