package src;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height > 0.0d ? height : 0.0d;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea()*getHeight();
    }


}
