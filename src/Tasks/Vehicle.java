package Tasks;

public class Vehicle {

	private String vehicleName = "Toyota Hilux" ;
	
	public void manufactureLocation() {
		System.out.println("Thailand");
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Vehicle(String vehicleName) {
		
		this.vehicleName = vehicleName;
	}
	
	public Vehicle() {
		
		vehicleName = "Toyota Hilux" ;
	}
	
}
