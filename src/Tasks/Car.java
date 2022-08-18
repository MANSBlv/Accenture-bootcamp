package Tasks;

public class Car extends Vehicle{

	String engine = "3.0 diesel";
	
	int mileage = 350000;
	
	int maxSpeed = 170;
	
	
	
	
	
	public Car() {
		
		engine = "3.0 diesel";
		mileage = 350000;
		maxSpeed = 170;
	}
	public Car(String vehicleName, String engine, int mileage, int maxSpeed) {
		super(vehicleName);
		this.engine = engine;
		this.mileage = mileage;
		this.maxSpeed = maxSpeed;
		
	}
	
	public String getEngine() {
		return engine;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
