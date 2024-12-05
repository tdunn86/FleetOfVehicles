//Thomas Dunn

public class Car extends Vehicle {
	
	//instance variables
	double gasMileage;
	int numPassengers;
	
	//default constructors
	public Car() {
		super();
		this.gasMileage = 0;
		this.numPassengers = 0;
	}
	
	//parameterized constructors
	public Car(String xManufacturerName, int xNumCylinders, String xOwnerName,
			double xGasMileage, int xNumPassengers) {
		super(xManufacturerName, xNumCylinders, xOwnerName);
		this.setGasMileage(xGasMileage);
		this.setNumPassengers(xNumPassengers);
	}
	
	//accessors
	public double getGasMileage() {
		return this.gasMileage;
	}
	
	public int getNumPassnegers() {
		return this.numPassengers;
	}
	
	//mutators with validation
	public void setGasMileage(double xGasMileage) {
		if(xGasMileage > 0) {
			this.gasMileage = xGasMileage;
		}
		else {
			System.out.println("Invalid value entered for gas mileage.");
		}
	}
	
	public void setNumPassengers(int xNumPassengers) {
		if(xNumPassengers > 0) {
			this.numPassengers = xNumPassengers;
		}
		else {
			System.out.println("Invalid value entered for number of passengers.");
		}
	}
	
	//other methods
	public boolean equals(Car a) {
		if(getManufacturerName().equalsIgnoreCase(a.getManufacturerName()) && getNumCylinders() == 
				a.getNumCylinders() && getOwnerName().equalsIgnoreCase(a.getOwnerName()) && 
				gasMileage == a.gasMileage && numPassengers == a.numPassengers) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Manufacturer's Name: " + getManufacturerName() + "\nNumber of Cylniders: " + 
				getNumCylinders() + "\nOwner's Name: " + getOwnerName() + "\nGas Mileage: " +
				gasMileage + " gallons \nNumber of Passengers: " + numPassengers;
	}

}
