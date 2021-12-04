package session6;

/**
 * Develop a program to manage a fleet of vehicles.
 * 1. create a vehicle with
 * 2.
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
