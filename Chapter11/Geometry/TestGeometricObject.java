package Chapter11.Geometry;

public class TestGeometricObject {
    public static void main(String[] args) throws Exception {
        // GeometriObject g = new GeometriObject("green", true);
        // System.out.println(g.toString());

        Circle c = new Circle("green", true, 1.0);
        System.out.println(c.toString());
      
        Circle c2 = new Circle("red", true, 1.0);
        System.out.println(c2.toString());

        System.out.println(c.equals(c2));

        // GeometricObject g = new GeometricObject("green", false);
        // System.out.println(c2.equals(g));

        GeometricObject g1 = new Circle("green", false, 1.0);
        

        System.out.println(c2.equals(g1));

        // Object o = new Object();
        // System.out.println(o.toString());

        // Object p = new Object();
        // System.out.println(p.toString());
        
        // System.out.println(o.equals(p));

        // p = o;
        // System.out.println(o.toString());
        // System.out.println(p.toString());
        // System.out.println(o.equals(p));
    }
}
