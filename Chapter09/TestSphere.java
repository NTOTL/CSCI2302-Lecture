package Chapter09;

public class TestSphere {
    public static void main(String[] args) {
        Sphere s1 = new Sphere();
        Sphere s2 = new Sphere(5.0);
        System.out.println("The radius is " + s1.getRadius());
        System.out.println("The volume is " + s1.getVolume());
        System.out.println("The surface area is " + s1.getSurfaceArea());

        s1.setRadius(4.0);
        System.out.println("The radius is " + s1.getRadius());
        System.out.println("The volume is " + s1.getVolume());
        System.out.println("The surface area is " + s1.getSurfaceArea());
    }
}

class Sphere{
    private double radius;

    // No-arg Cosntructor
    public Sphere(){
        radius = 1.0;
    }

    public Sphere(double newRadius){
        radius = newRadius;
    }

    // getter
    public double getRadius(){
        return radius;
    }

    // setter
    public void setRadius(double newRadius){
        radius = newRadius;
    }

    // Methods
    // Calculate the volume of the sphere
    public double getVolume(){
        return (Math.PI * radius * radius * radius * 4.0/3.0);
    }

    // Calculate the surface area
    public double getSurfaceArea(){
        return (Math.PI * radius * radius * 4);
    }
}
