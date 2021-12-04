package session6;

/**
 * Implement a class PlugInHybrid, that is a subclass of Vehicle. In comparison to Vehicle it also has a battery,
 * which allows the car to travel around 50 km using power. Consider this in your methods.
 */
public class PlugInHybrid extends Vehicle {
    public PlugInHybrid(String model, double consumption) {
        super(model, Fuel.HYBRID, consumption);
    }


    /**
     * It has a battery, which allows the car to travel around 50 km using power.
     * @return remainingRange as double
     */
    @Override
    public double getRemainingRange() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "PlugInHybrid{" +
                "chassisNumber='" + this.chassisNumber + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", tankLevel=" + tankLevel +
                ", consumption=" + consumption +
                ", fuelType=" + fuelType +
                '}';
    }
}
