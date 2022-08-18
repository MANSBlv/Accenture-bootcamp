package Tasks;

public class PickupTruck extends Car {

	public static void main(String[] args) {
		
		
		PickupTruck truck = new PickupTruck();
		
		System.out.println(truck.getVehicleName());
		
		truck.manufactureLocation();
		
		truck.switchingGears((byte)2);
		
		truck.speedChange();
		
	}
	
	
	byte gears = 6;
	String color = "Black";
	int speed = 90;
	
	
	
	public PickupTruck() {
		
		gears = 6;
		color = "Black";
		speed = 90;
	}



	public PickupTruck(String vehicleName, String engine, int mileage, int maxSpeed,byte gears, String color, int speed) {
		super(vehicleName,engine, mileage, maxSpeed);
		this.gears = gears;
		this.color = color;
		this.speed = speed;
	}

	public void switchingGears(byte inputGear) {
		if(inputGear > 0 && inputGear <= 6) {
			gears = inputGear;
			System.out.println(gears);
		}else {
			System.out.println("Incorrect input");
			gears = inputGear;
		}
	}
	
	public void speedChange () {
		switch (gears) {
		case 1:
			speed = 15;
			System.out.println("driving at the speed of "+speed+"km/h");
			break;
		case 2:
			speed = 25;
			System.out.println("driving at the speed of "+speed+"km/h");
			break;
		case 3:
			speed = 35;
			System.out.println("driving at the speed of "+speed+"km/h");
			break;
		case 4:
			speed = 55;
			System.out.println("driving at the speed of "+speed+"km/h");
			break;
		case 5:
			speed = 65;
			System.out.println("driving at the speed of "+speed+"km/h");
			break;
		case 6:
			speed = 85;
			System.out.println("driving at the speed of "+speed+"km/h");
			break;
		default:
			System.out.println("Incorrect gear");
			
		}
	}

	public byte getGears() {
		return gears;
	}

	public void setGears(byte gears) {
		this.gears = gears;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
