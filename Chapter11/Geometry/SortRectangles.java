package Chapter11.Geometry;

public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
            new ComparableRectangle(3.4, 5.6),
            new ComparableRectangle(13.24, 55.4),
            new ComparableRectangle(7.4, 35.2),
            new ComparableRectangle(1.4, 25.4)
        };
        java.util.Arrays.sort(rectangles);
        
        for (ComparableRectangle r : rectangles){
            System.out.print(r + " ");
            System.out.println();
        }
    }
}
