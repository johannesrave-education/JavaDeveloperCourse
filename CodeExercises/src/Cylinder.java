package src;

public class Cylinder extends Circle{
    private double height;
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height > 0.0d ? height : 0.0d;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height*this.getArea();
    }
}
