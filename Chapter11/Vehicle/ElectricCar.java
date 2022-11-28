package Chapter11.Vehicle;

public class ElectricCar extends Car {
    private double battery_level;

    public double getBattery_level() {
        return battery_level;
    }

    public void setBattery_level(double battery_level) {
        this.battery_level = battery_level;
    }

    @Override
    public double refuel(double amount) {
        if (battery_level + amount <= 100){
            setBattery_level(amount + battery_level);
            return battery_level;
        }
        else{
            System.out.println("Cannot refuel. It will overcharge.");
            return -1;
        }
    }

    

    
}
