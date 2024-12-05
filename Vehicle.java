//Thomas Dunn 

public class Vehicle implements VehicleInterface {
	
	//instance variables
	private String manufacturerName;
	private int numCylinders;
	private String ownerName;

	//default constructor
	public Vehicle() {
		this.manufacturerName = "none";
		this.numCylinders = 0;
		this.ownerName = "none";
	}
	
	//parameterized constructor
	public Vehicle(String xManufacturerName, int xNumCylinders, String xOwnerName) {
		this.setManufacturerName(xManufacturerName);
		this.setNumCylinders(xNumCylinders);
		this.setOwnerName(xOwnerName);
	}
	
	//accessors
	public String getManufacturerName() {
		return this.manufacturerName;
	}
	
	public int getNumCylinders() {
		return this.numCylinders;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	
	//mutators with validation
	public void setManufacturerName(String xManufacturerName) {
		this.manufacturerName = xManufacturerName;
	}
	
	public void setNumCylinders(int xNumCylinders) {
		if (xNumCylinders > 0) {
			this.numCylinders = xNumCylinders;
		}
		else {
			System.out.println("Invalid value entered for number of cylinders.");
		}
	}
	
	public void setOwnerName(String xOwnerName) {
		this.ownerName = xOwnerName;
	}
	
	//other methods
	public boolean equals(Vehicle a) {
		if(manufacturerName.equalsIgnoreCase(a.manufacturerName) && numCylinders == a.numCylinders 
				&& ownerName.equalsIgnoreCase(a.ownerName)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Manufacturer's Name: " + manufacturerName + "\nNumber of Cylniders: " + 
				numCylinders + "\nOwner's Name: " + ownerName;
	}
	
	
	
}
