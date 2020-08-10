
public class HealthyBurger extends Hamburger {

	private boolean egg;
	private boolean cucumber;
	
	private static double eggsPrice;
	private static double cucumbersPrice;
	
	public HealthyBurger() {
		this("Healthy Burger", "Brown Rye Bread Roll", "Turkey", false, false, false, false, 5.00, false, false);
	}
	
	public HealthyBurger(String name, String rollType, String meat, boolean lettuce, boolean tomatoes, 
			boolean onions, boolean pickles, double basePrice, boolean egg, boolean cucumber) {
		super(name, rollType, meat, lettuce, tomatoes, onions, pickles, basePrice);
		
		this.egg = egg;
		this.cucumber = cucumber;
		
		eggsPrice = 0.30;
		cucumbersPrice = 0.20;
	}
	
	public HealthyBurger(boolean lettuce, boolean tomatoes, boolean onions, boolean pickles, boolean egg, boolean cucumber) {
		this("Healthy Burger", "Brown Rye Bread Roll", "Turkey", lettuce, tomatoes, onions, pickles, 5.00, egg, cucumber);
	}
	
	
	@Override
	public double calculateTotal() {
		double totalPrice = super.calculateTotal();
		
		if(egg)
			totalPrice += eggsPrice;
		if(cucumber)
			totalPrice += cucumbersPrice;
		
		return totalPrice;
	}
	
	@Override
	public void displaySubTotal() {
		super.displaySubTotal();
		
		if(egg)
			System.out.printf("+ Eggs: %.2f\n", eggsPrice);
		if(cucumber) 
			System.out.printf("+ Cucumbers: %.2f\n", cucumbersPrice);
	}
	
	
	public static double getCucumbersPrice() {
		return cucumbersPrice;
	}
	
	public static double getEggPrice() {
		return eggsPrice;
	}
	
	public boolean hasEgg() {
		return egg;
	}
	
	public boolean hasCucumber() {
		return cucumber;
	}
	
	public void setEgg(boolean egg) {
		this.egg = egg;
	}
	
	public void setCucumber(boolean cucumber) {
		this.cucumber = cucumber;
	}
	
	
}
