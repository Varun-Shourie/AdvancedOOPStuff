
public class Car extends Vehicle {

	private String gearPosition;
	private String steeringDirection;
	private int steeringWheels;
	
	public Car() {
		this(200, "Sedan", 4, 25.0, "P", "Center", 1);
	}

	public Car(int horsepower, String model, int seats, double speed) {
		this(horsepower, model, seats, speed, "P", "Center", 1);
	}
	
	public Car(int horsepower, String model, int seats, double speed,
			String gearPosition, String steeringDirection, int steeringWheels) {
		
		super(true, horsepower, model, seats, speed);
		
		this.gearPosition = gearPosition;
		this.steeringDirection = steeringDirection;
		this.steeringWheels = steeringWheels;
	}
	
	public void changeGears(String desiredGear) {
		System.out.println("The car will change gears to " + desiredGear + ".");
		
		setGearPosition(desiredGear);
	}

	public String getGearPosition() {
		return gearPosition;
	}

	public String getSteeringDirection() {
		return steeringDirection;
	}

	public int getSteeringWheels() {
		return steeringWheels;
	}

	public void setGearPosition(String gearPosition) {
		switch(gearPosition.toUpperCase()) {
		
		case "D":
		case "R":
		case "P":
		case "N":
			this.gearPosition = gearPosition;
			
		default:
			System.out.println("Invalid gear. Please try again.");
		}
	}

	public void setSteeringDirection(String steeringDirection) {
		
		switch(steeringDirection.toLowerCase()) {
		
		case "left":
		case "right":
		case "center":
			this.steeringDirection = steeringDirection.toLowerCase();
			
		default:
			System.out.println("Invalid steering direction. Please try again.");
			
		}
	}

	public void setSteeringWheels(int steeringWheels) {
		this.steeringWheels = steeringWheels;
	}
	
	public void steer(String steerDirection) {
		
	}
	
	
}
