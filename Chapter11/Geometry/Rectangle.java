package Chapter11.Geometry;

public class Rectangle extends GeometricObject{
    private double width;
    private double length;
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        
        return width * length;
    }
    @Override
    public double getPerimeter() {        
        return 2 * (width + length);
    }
    @Override
    public String toString() {        
        return super.toString() + " Area: " + this.getArea();
    }
    
}
