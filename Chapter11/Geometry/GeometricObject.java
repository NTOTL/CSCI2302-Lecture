package Chapter11.Geometry;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;


    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public GeometricObject() {
        this.dateCreated = new Date();
    }

    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Date getDateCreate(){
        return dateCreated;
    }

    // create two abstract methods
    // 1. getArea()
    public abstract double getArea();

    // 2. getPerimeter()
    public abstract double getPerimeter();

    // Methods
    public String toString(){
        //return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
        StringBuilder sb = new StringBuilder();
        sb.append("created on ");
        sb.append(this.dateCreated);
        sb.append("\ncolor: ");
        sb.append(this.color);
        sb.append(" and filled: ");
        sb.append(this.filled);
        return sb.toString();
    }    
}
