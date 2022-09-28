package Chapter09;

public class Car {
    private String make;
    private String model;
    private double mileage;
    private String VIN;

    // Constructors
    public Car(){
        mileage = 0.0;        
    }

    public Car(String make, String newModel, String VIN){
        this.make = make;
        this.model = newModel;
        this.VIN = VIN;
    }

    // getters
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public double getMileage(){
        return this.mileage;
    }
    public String getVIN(){
        return this.VIN;
    }

    // setters
    public void setMake(String newMake){
        this.make = newMake;
    }
}
