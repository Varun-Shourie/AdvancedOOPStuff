
public class Vehicle {

	private boolean hasEngine; 
	private int horsepower;
	private String model;
	private int seats;
	private double speed;
	
	public Vehicle() {
		this(true, 500, "Default vehicle.", 2, 0);
	}
	
	public Vehicle(boolean hasEngine, int horsepower, String model, int seats, double speed) {
		this.hasEngine = hasEngine;
		this.horsepower = horsepower;
		this.model = model;
		this.seats = seats;
		this.speed = speed;
	}
	
	public boolean hasEngine() {
		return hasEngine;
	}
	
	public int getHorsepower() {
		return horsepower;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void move() {
		System.out.println("The vehicle is currently moving at a speed of " + speed + " mi/h.");
	}
	
	public void setManual(boolean isManual) {
		this.hasEngine = isManual;
	}
	
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void stop() {
		setSpeed(0);
		
		System.out.println("The vehicle has stopped. The speed is now " + getSpeed() + ".");
	}
	
}
