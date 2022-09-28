package Chapter09;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();   // the radius is 1.0  
        System.out.println("The radius is : " + c1.getRadius());        
        double area = c1.getArea();
        double circumference = c1.getCircumference();

        System.out.printf("The area of the circle is %.2f\nThe circumference of the circle is %.2f\n", area, circumference);

        c1.setRadius(3.0);
        System.out.println("The radius is : " + c1.getRadius());  
        area = c1.getArea();
        circumference = c1.getCircumference();

        System.out.printf("The area of the circle is %.2f\nThe circumference of the circle is %.2f\n", area, circumference);


    }
}
