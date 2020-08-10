
public class SportsCar extends Car {
	
	private int cylinders;
	private boolean isTurbocharged;

	public SportsCar() {
		this(6, true);
	}
	
	public SportsCar(int cylinders, boolean isTurboCharged) {
		this(500, "Sports Coupe", 2, 60.0, "P", "Center", 1, cylinders, isTurboCharged);
	}
	
	public SportsCar(int horsepower, String model, int seats, double speed, String gearPosition, String steeringDirection, int steeringWheels, 
			int cylinders, boolean isTurboCharged) {
		
		super(500, "Sports Coupe", 2, 60.0, "P", "Center", 1);
		
		this.cylinders = cylinders;
		this.isTurbocharged = true;
	}
	
	public int getCylinders() {
		return cylinders;
	}

	public boolean isTurbocharged() {
		return isTurbocharged;
	}

	public void rev() {
		System.out.println("VROOM VROOM VROOM!!");
		move();
	}
	
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public void setTurbocharged(boolean isTurbocharged) {
		this.isTurbocharged = isTurbocharged;
	}

}
