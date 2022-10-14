package Chapter09;

public class RegularPolygon {
    private int n; // the number of sides of the polygon
    private int side; // the length of the side
    private double x; // the x-coordinate of the center of the polygon
    private double y; // the y-coordinate of the center of the polygon

    public RegularPolygon(int n, int side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public RegularPolygon(int n, int side) {
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    public RegularPolygon() {
        n = 3;
        x = 0;
        y = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter(){        
        return side * n;
    }

    public double getArea(){
        //return (n * side * side)/(4 * Math.tan(Math.PI/n));
        double numerator = n * side * side;
        double denominator = 4 * Math.tan(Math.PI/n);
        return numerator/denominator;
    }
    

    
}
