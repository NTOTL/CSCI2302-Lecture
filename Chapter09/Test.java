package Chapter09;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3.0;
        double area = c1.getArea();
        double circumference = c1.getCircumference();

        System.out.printf("The area of the circle is %.2f\nThe circumference of the circle is %.2f\n", area, circumference);
    }
}
