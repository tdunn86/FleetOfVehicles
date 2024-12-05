
public interface VehicleInterface {

	public String getManufacturerName();
	public int getNumCylinders();
	public String getOwnerName();
	
	public void setManufacturerName(String xManufacturerName);
	public void setNumCylinders(int xNumCylinders);
	public void setOwnerName(String xOwnerName);
	
	public boolean equals(Vehicle a);
	public String toString();
	
}
