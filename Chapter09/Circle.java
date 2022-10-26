package Chapter09;

public class Circle {
    private double radius;    

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI * radius * radius);
    }

    public double getPerimeter(){
        return (Math.PI * 2 * radius);
    }

    public String toString(){
        return "The radius of the circle is " + this.radius + ". The area is " + this.getArea() + ". The perimeter is " + this.getPerimeter() + ".";
    }

    
    

    
}
