package session6;

/**
 * Develop a program to manage a fleet of vehicles.
 * A vehicle is represented by a chassis number, model, mileage, tank level, average fuel consumption and type of fuel.
 * Implement a class Vehicle. Add methods for refueling and driving the vehicle and that calculate the remaining range.
 * Then implement a class PlugInHybrid, that is a subclass of Vehicle. In comparison to Vehicle it also has a battery,
 * which allows the car to travel 50 km using power. Consider this in your methods.
 */
public class Task1 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Ford", Vehicle.Fuel.GASOLINE, 8.0);
        car.drive(500);
        car.refuel(30.33);
        double carRange = car.getRemainingRange();
        System.out.println(carRange + "\n");

        PlugInHybrid hybrid = new PlugInHybrid("Prius", 3.8);
        hybrid.drive(500);
        hybrid.refuel(30.33);
        double hybridRange = hybrid.getRemainingRange();
        System.out.println(hybridRange);
    }


}
