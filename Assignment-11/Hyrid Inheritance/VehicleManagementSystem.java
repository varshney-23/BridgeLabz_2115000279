interface Refuelable{
    void refuel();
}
class Vehicle{
    int maxSpeed;
	String model;
	public Vehicle(int maxSpeed,String model){
	    this.maxSpeed=maxSpeed;
		this.model=model;
	}
	public void displayVehicleInfo(){
	    System.out.println("Model --> "+model);
		System.out.println("Max Speed --> "+maxSpeed+" km/h");
	}
}
class ElectricVehicle extends Vehicle{
    int batteryCapacity;
    public ElectricVehicle(int maxSpeed,String model,int batteryCapacity){
	    super(maxSpeed,model);
		this.batteryCapacity=batteryCapacity;
	}
	public void charge(){
	    System.out.println("Charging vehicle's battery");
	}
	public void displayElectricVehicleInfo(){
        System.out.println("Battery Capacity --> "+batteryCapacity+" kWh");
	}
}
class PetrolVehicle extends Vehicle implements Refuelable{
    double fuelCapacity;
	public PetrolVehicle(int maxSpeed,String model,double fuelCapacity){
	    super(maxSpeed,model);
		this.fuelCapacity=fuelCapacity;
	}
	@Override
	public void refuel(){
	    System.out.println("Refueling the petrol tank");
	}
	public void displayPetrolVehicleInfo(){
	    System.out.println("Fuel Capacity --> "+fuelCapacity+" liters");
	}
}
public class VehicleManagementSystem{
    public static void main(String[] args){
        ElectricVehicle nissa = new ElectricVehicle(150, "okayokay", 62); 
        PetrolVehicle honda = new PetrolVehicle(180, "blahblah", 45.0);
		nissa.displayVehicleInfo();
		nissa.displayElectricVehicleInfo();
		nissa.charge();
		System.out.println();
		honda.displayVehicleInfo();
		honda.displayPetrolVehicleInfo();
	    honda.refuel();
	}
}