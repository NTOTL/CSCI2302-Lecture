package Chapter09;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);   // the radius is 5.0  
        //System.out.println("The radius is : " + c1.getRadius());        
        //double area = c1.getArea();
        //double circumference = c1.getPerimeter();
        System.out.println(c1.toString());

        c1.setRadius(3.0);
        System.out.println(c1.toString());
        

    }
}
