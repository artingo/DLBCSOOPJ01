package session6;

/**
 * A vehicle is represented by a chassis number, model, mileage, tank level, average fuel consumption and type of fuel.
 * Implement a class Vehicle. Add methods for refueling and driving the vehicle and that calculate the remaining range.
 */
public class Vehicle {
    protected String chassisNumber;
    protected String model;
    protected double mileage; // i.e. how many kilometers it has run
    protected double tankLevel;
    protected double consumption; // i.e. liters fuel per kilometer
    protected Fuel fuelType;

    public Vehicle(String model, Fuel fuelType, double consumption) {
        this.model = model;
        this.fuelType = fuelType;
        this.consumption = consumption;
    }

    /**
     * Refuels the vehicle by <liters> of fuel
     * @param liters as double - how many fuel was added
     * @return tankLevel as double - the new tank level
     */
    public double refuel(double liters) {
        // write your code here
        return 0.0;
    }

    /**
     * Drives the vehicle <distance> kilometers
     * @param distance as double - how many kilometers to drive
     * @return remainingRange as double - how many kilometers range remain
     */
    public double drive (double distance) {
        // write your code here
        return 0.0;
    }

    /**
     * Calculates how many kilometers range remain
     * @return remainingRange as double
     */
    public double getRemainingRange() {
        // write your code here
        return 0.0;
    }

    enum Fuel {
        GASOLINE,
        DIESEL,
        HYBRID,
        ELECTRO
    }
}

