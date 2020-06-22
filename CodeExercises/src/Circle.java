package src;

public class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius > 0.0d ? radius : 0.0d;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }
}