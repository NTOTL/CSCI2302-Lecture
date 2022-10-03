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
        this.mileage = 1.0;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String vIN) {
        VIN = vIN;
    }

    
    
}
