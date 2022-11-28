package Chapter11.Geometry;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

    public ComparableRectangle(double width, double length) {
        super(width, length);        
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (this.getArea() > o.getArea()){
            return 1;
        }
        else if (this.getArea() < o.getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }
    
}
