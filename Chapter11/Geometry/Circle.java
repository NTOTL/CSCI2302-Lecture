package Chapter11.Geometry;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;        
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nradius: ");
        sb.append(this.radius);
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Circle){
            if (this.radius == ((Circle)obj).radius){
                return true;
            }
        }
        return false;
    }
    
    @Override // the implementation of the abstract method in GeometricObject
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    
}
