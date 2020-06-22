package src;

public class Rectangle {
    private double width;
    private double length;
    
    public Rectangle (double width, double length){
        this.width = width > 0.0d ? width : 0.0d;
        this.length = length > 0.0d ? length : 0.0d;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return (getWidth() * getLength());
    }
}
