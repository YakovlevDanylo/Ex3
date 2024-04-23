package Task0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricShape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.5));
        shapes.add(new Circle(13));
        shapes.add(new Square(5));
        shapes.add(new Square(3));
        shapes.add(new Triangle(2,5,3));
        System.out.println(getAreaSum(shapes));
    }

    public static double getAreaSum(ArrayList<GeometricShape> shapes) {
        double sum = 0;
        for (GeometricShape shape : shapes) {
            sum += shape.getArea();
        }

        return sum;
    }
}