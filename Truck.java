//Thomas Dunn

public class Truck extends Vehicle {
	
	//instance variables
	double loadCapacity;
	double towingCapacity;
	
	//default constructors 
	public Truck() {
		super();
		this.loadCapacity = 0;
		this.towingCapacity = 0;
	}
	
	//parameterized constructor
	public Truck(String xManufacturerName, int xNumCylinders, String xOwnerName, double xLoadCapacity, double xTowingCapacity) {
		super(xManufacturerName, xNumCylinders, xOwnerName);
		this.setLoadCapacity(xLoadCapacity);
		this.setTowingCapacity(xTowingCapacity);
	}
	
	//accessors
	public double getLoadCapacity() {
		return this.loadCapacity;
	}
	
	public double getTowingCapacity() {
		return this.towingCapacity;
	}
	
	//mutators with validation
	public void setLoadCapacity(double xLoadCapacity) {
		if(xLoadCapacity > 0) {
			this.loadCapacity = xLoadCapacity;
		}
		else {
			System.out.println("Invalid value entered for load capacity.");
		}
	}
	
	public void setTowingCapacity(double xTowingCapacity) {
		if(xTowingCapacity > 0) {
			this.towingCapacity = xTowingCapacity;
		}
		else {
			System.out.println("Invalid value entered for towing capacity.");
		}
	}
	
	//other methods
	public boolean equals(Truck a) {
		if(getManufacturerName().equalsIgnoreCase(a.getManufacturerName()) && getNumCylinders() == 
				a.getNumCylinders() && getOwnerName().equalsIgnoreCase(a.getOwnerName()) && loadCapacity 
				== a.loadCapacity && towingCapacity == a.towingCapacity) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Manufacturer's Name: " + getManufacturerName() + "\nNumber of Cylniders: " + 
				getNumCylinders() + "\nOwner's Name: " + getOwnerName() + "\nTowing Capacity: "
				+ towingCapacity + "\nLoad Capacity: " + loadCapacity;
	}
	
	
	
	
}
