package Chapter11;

public class MotorVehicle {
    private String make;
    private String model;
    private double mileage;
    private String VIN;
    private int year;
    private double price;
    private double fuel_level;
    private boolean sold;
    private boolean on_lot;
    
    public MotorVehicle() {
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
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year > 1700){
            this.year = year;
        }
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }        
    }
    public double getFuel_level() {
        return fuel_level;
    }
    public void setFuel_level(double fuel_level) {
        if (fuel_level > 0){
        this.fuel_level = fuel_level;
        }
    }
    public boolean isSold() {
        return sold;
    }
    public void setSold(boolean sold) {
        this.sold = sold;
    }
    public boolean isOn_lot() {
        return on_lot;
    }
    public void setOn_lot(boolean on_lot) {
        this.on_lot = on_lot;
    }
}
