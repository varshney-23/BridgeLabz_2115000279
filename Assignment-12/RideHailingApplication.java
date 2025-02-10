import java.util.ArrayList;
import java.util.List;
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    void getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location: " + location);
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Updated Location: " + location);
    }
}

class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9; 
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location: " + location);
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Updated Location: " + location);
    }
}

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 1.1; 
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location: " + location);
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Updated Location: " + location);
    }
}


public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();

        Car car = new Car("C606", "ayu", 15.0, "khurja");
        Bike bike = new Bike("B8902", "pran", 8.0, "bsr");
        Auto auto = new Auto("A5793", "panda", 10.0, "center of city");

        rides.add(car);
        rides.add(bike);
        rides.add(auto);

        double distance = 10; 

        for (Vehicle ride : rides) {
            ride.displayDetails();
            System.out.println("Fare for " + distance + " km: " + ride.calculateFare(distance));
            if (ride instanceof GPS) {
                ((GPS) ride).getCurrentLocation();
            }
        }
    }
}