
public class Hamburger {
	
	private String name;
	private String rollType;
	private String meat;
	
	private boolean lettuce;
	private boolean tomatoes;
	private boolean onions;
	private boolean pickles;
	
	private double basePrice;
	private static double lettucePrice;
	private static double tomatoesPrice;
	private static double onionsPrice;
	private static double picklesPrice;
	
	public Hamburger(String name, String rollType, String meat, boolean lettuce, boolean tomatoes, boolean onions, 
			boolean pickles, double basePrice) {
		this.name = name;
		this.rollType = rollType;
		this.meat = meat;
		this.lettuce = lettuce;
		this.tomatoes = tomatoes;
		this.onions = onions;
		this.pickles = pickles;
		this.basePrice = basePrice;
		
		lettucePrice = 0.20;
		tomatoesPrice = 0.20;
		onionsPrice = 0.20;
		picklesPrice = 0.20;
	}
	
	public Hamburger(boolean lettuce, boolean tomatoes, boolean onions, boolean pickles) {
		this("The Classic Burger", "White Bread Roll with Sesame Seeds", "Extra Juicy Beef Patty", lettuce,
				tomatoes, onions, pickles, 3.99);
	}
	
	public Hamburger() {
		this("The Classic Burger", "White Bread Roll with Sesame Seeds", "Extra Juicy Beef Patty", false, false, false,
				false, 3.99);
	}
	
	public double calculateTotal() {
		double totalPrice = basePrice;
		
		if(lettuce) {
			totalPrice += lettucePrice;
		}
		if(tomatoes) {
			totalPrice += tomatoesPrice;
		}
		if(onions) {
			totalPrice += onionsPrice;
		}
		if(pickles) {
			totalPrice += picklesPrice;
		}
		
		return totalPrice;
	}
	
	public void displayReceipt() {
		displaySubTotal();
		displayTotal();
	}
	
	public void displaySubTotal() {
		System.out.printf("%s: %.2f\n", name, basePrice);
		
		if(lettuce)
			System.out.printf("+ Lettuce: %.2f\n", lettucePrice);
		if(tomatoes)
			System.out.printf("+ Tomatoes: %.2f\n", tomatoesPrice);
		if(onions)
			System.out.printf("+ Onions: %.2f\n", onionsPrice);
		if(pickles)
			System.out.printf("+ Pickles: %.2f\n", picklesPrice);
	}
	
	public void displayTotal() {
		System.out.printf("Total price: %.2f\n", calculateTotal());
	}

	public String getName() {
		return name;
	}

	public String getRollType() {
		return rollType;
	}

	public String getMeat() {
		return meat;
	}

	public boolean hasLettuce() {
		return lettuce;
	}

	public boolean hasTomatoes() {
		return tomatoes;
	}

	public boolean hasOnions() {
		return onions;
	}

	public boolean hasPickles() {
		return pickles;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public static double getLettucePrice() {
		return lettucePrice;
	}

	public static double getTomatoesPrice() {
		return tomatoesPrice;
	}

	public static double getOnionsPrice() {
		return onionsPrice;
	}

	public static double getPicklesPrice() {
		return picklesPrice;
	}	
}
