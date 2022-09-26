package Chapter09;

public class Circle {
    // Data field: radius
    private double radius = 1.0;

    // Method: calculating the area of the circle
    public double getArea(){
        return (Math.PI * radius * radius);
    }

    // Method: calculating the circumference of the circle
    public double getCircumference(){
        return (Math.PI * 2 * radius);
    }
}
