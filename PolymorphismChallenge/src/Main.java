
import java.util.*;

class Car {
	
	private String name;
	private int cylinders;
	private int wheels;
	private boolean hasEngine;
	private int doors;
	
	public Car(String name, int cylinders, int doors) {
		this.name = name;
		
		if(cylinders % 2 == 0 && cylinders > 0 && cylinders <= 8)
			this.cylinders = cylinders;
		else
			this.cylinders = -1;
		
		this.wheels = 4;
		this.hasEngine = true;
		
		if(doors == 2 || doors == 4) 
			this.doors = doors;
		else
			this.doors = -1;
	}
	
	public Car() {
		this("Default car", 4, 4);
	}

	public String getName() {
		return name;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

	public boolean isHasEngine() {
		return hasEngine;
	}

	public int getDoors() {
		return doors;
	}
	
	public void accelerate() {
		System.out.println("Car.accelerate() called: The car is gaining speed.");
	}
	
	public void brake() {
		System.out.println("Car.brake() called: The car is losing speed.");
	}
	
	public void startEngine() {
		System.out.println("Car.startEngine() called: Car Ignition --> ON");
	}
}

class Prius extends Car {
	
	public Prius() {
		super("Toyota Prius Hybrid", 4, 4);
	}
	
	@Override
	public void accelerate() {
		System.out.println("Prius.accelerate() called: The car utilizes the battery to accelerate quicker.");
	}
	
	@Override
	public void brake() {
		System.out.println("Prius.brake() called: The car uses regenerative braking to reduce speed.");
	}
	
	@Override
	public void startEngine() {
		System.out.println("Prius.startEngine() called: The battery is turned on along with the engine.");
	}
}

class Corvette extends Car {
	
	public Corvette() {
		super("2020 Chevrolet Corvette Special Edition", 8, 2);
	}
	
	@Override
	public void accelerate() {
		System.out.println("Corvette.accelerate() called: The car picks up like crazy, goes from 0-100 real quick.");
	}
	
	@Override
	public void brake() {
		System.out.println("Corvette.brake() called: The car brakes slightly, but can't stop since it's so darn fast.");
	}
	
	@Override
	public void startEngine() {
		System.out.println("Corvette.startEngine() called: Oooh boy, listen to the roar of that engine.");
	}
}

class Model3 extends Car {
	public Model3() {
		super("Tesla Model 3", 0, 4);
	}
	
	@Override
	public void accelerate() {
		System.out.println("Model3.accelerate() called: You can't even tell it's speeding up. It's that silent.");
	}
	
	@Override
	public void brake() {
		System.out.println("Model3.brake() called: You just let your foot go off the gas pedal. That's really it.");
	}
	
	@Override
	public void startEngine() {
		System.out.println("Model3.startEngine() called: It was always on anyways, you silly goose.");
	}
}

public class Main {

	/*
	 * POLYMORPHISM CHALLENGE: 
	 * Create a base class called Car. It should have a few fields that would be appropriate for a generic car class.
	 * Engine, cylinders, wheels, etc. The constructor should initialize cylinders (numbers of) and name, and set 
	 * wheels to 4 and engine to true. Cylinders and names would be passed parameters. 
	 * 
	 * Create appropriate getters. 
	 * 
	 * Create some methods to start the engine, accelerate, and brake.
	 * 
	 * Show a message for each in the base class. Now, create 3 sub classes for your favorite vehicles.
	 * Override the appropriate methods to demonstrate polymorphism in use. Put all classes in one java file (this one).
	 */
	
	public static void main(String[] args) {
		Car prius = returnPrius();
		
		System.out.println(prius.getName());
		prius.accelerate();
		prius.brake();
		prius.startEngine();
	}
	
	// Non object oriented polymorphism examples 
	
	public static void displayRandomCars() {
		for(int i = 0; i < 5; i++) {
			Car randomCar = chooseRandomCar();
			
			System.out.println(randomCar.getName());
			randomCar.accelerate();
			randomCar.brake();
			randomCar.startEngine();
			
			System.out.println();
		}
	}
	
	public static Car chooseRandomCar() {
		Random randomGenerator = new Random();
		
		int carNumber = 0;
		carNumber = randomGenerator.nextInt(4);
		
		switch(carNumber) {
		case 0:
			return new Car("Kia Sorrento", 4, 4);
		case 1:
			return new Corvette();
		case 2:
			return new Prius();
		case 3: 
			return new Model3();
		default:
			return null;
		}
	}
	
	// Enhanced polymorphism example. 
	
	public static void displayCars() {
		ArrayList<Car> carList = new ArrayList<>();
		
		Car sorrento = new Car("Kia Sorrento", 4, 4);
		carList.add(sorrento);
		
		Corvette corvette = new Corvette();
		carList.add(corvette);
		
		Model3 model3 = new Model3();
		carList.add(model3);
		
		Prius prius = new Prius();
		carList.add(prius);
		
		for(Car c : carList) {
			if (c instanceof Corvette) {
				Corvette cv = (Corvette) c;
				
				cv.getName();
				cv.accelerate();
				cv.brake();
				cv.startEngine();
			}
			else if (c instanceof Prius) {
				Prius p = (Prius) c;
				
				p.getName();
				p.accelerate();
				p.brake();
				p.startEngine();
			}
			else if (c instanceof Model3) {
				Model3 m = (Model3) c;
				
				m.getName();
				m.accelerate();
				m.brake();
				m.startEngine();
			}
			else {
				c.getName();
				c.accelerate();
				c.brake();
				c.startEngine();
			}
			
			System.out.println();
		}
	}
	
	public static Car returnPrius() {
		Prius priusOne = new Prius();
		
		Car prius = (Car) priusOne;
		
		return prius;
	}
}



