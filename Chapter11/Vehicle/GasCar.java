package Chapter11.Vehicle;

public class GasCar extends Car {
    private double tank_capacity;
    
    public double getTank_capacity() {
        return tank_capacity;
    }

    public void setTank_capacity(double tank_capacity) {
        this.tank_capacity = tank_capacity;
    }

    @Override
    public double refuel(double amount) {
        if (getFuel_level() + amount < tank_capacity){
            setFuel_level(amount + getFuel_level());
            return getFuel_level();
        }
        else{
            System.out.println("Cannot refuel. It will overfill.");
            return -1;
        }
    }
}
