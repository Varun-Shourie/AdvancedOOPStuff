
public class DeluxeBurger extends Hamburger {

	private boolean chips;
	private boolean drinks;
	
	private static double chipsPrice;
	private static double drinksPrice;
	
	public DeluxeBurger() {
		this(3.99);
	}
	
	public DeluxeBurger(double basePrice) {
		this("Deluxe Burger", "White Bread with Sesame Seeds", "Ground Beef", basePrice);
	}
	
	public DeluxeBurger(String name, String rollType, String meat, double basePrice) {
		super(name, rollType, meat, false, false, false, false, basePrice);
		
		this.chips = true;
		this.drinks = true;
		
		chipsPrice = 0.75;
		drinksPrice = 0.75;
	}
	
	@Override
	public double calculateTotal() {
		double totalPrice = super.calculateTotal();
		
		if(chips)
			totalPrice += chipsPrice;
		if(drinks)
			totalPrice += drinksPrice;
		
		return totalPrice;
	}
	
	@Override
	public void displaySubTotal() {
		super.displaySubTotal();
		
		if(chips)
			System.out.printf("+ Chips: %.2f\n", chipsPrice);
		if(drinks) 
			System.out.printf("+ Drinks: %.2f\n", drinksPrice);
	}
	
	public static double getChipsPrice() {
		return chipsPrice;
	}
	
	public static double getDrinksPrice() {
		return drinksPrice;
	}
	
	public boolean hasChips() {
		return chips;
	}
	
	public boolean hasDrinks() {
		return drinks;
	}
	
}
