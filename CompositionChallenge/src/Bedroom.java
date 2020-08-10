
public class Bedroom {

	private Bed bed;
	private Dresser dresser;
	private Window window;
	private Lamp lamp;
	private int bedsideTables;
	
	public Bedroom() {
		this(new Bed(), new Dresser(), new Window(), new Lamp(), 1);
	}
	
	public Bedroom(Bed bed, Dresser dresser, Window window, Lamp lamp, int bedsideTables) {
		this.bed = bed;
		this.dresser = dresser;
		this.window = window;
		this.lamp = lamp;
		this.bedsideTables = bedsideTables;
	}
	
	public void cleanDresser() {
		dresser.cleanTheDresser();
	}
	
	public void executeADay() {
		System.out.println("\t\tClean your bedroom for the day!\n");
		makeBed();
		cleanDresser();
		
		Main.pause();
		
		System.out.println("\n\t\tInspecting the bed afterwards.\n");
		printBedInformation();
		
		Main.pause();
		
		System.out.println("\n\t\tRestocking laundry in the bedroom.\n");
		restockLaundry();
		
		Main.pause();
		
		System.out.println("\n\t\tFinding an outfit to head outside of the bedroom.\n");
		findAnOutfit();
		
		Main.pause();
		
		System.out.println("Bye!");
		System.exit(0);
	}
	
	public void findAnOutfit() {
		System.out.println("You will shortly try to find an outfit. If you fail, you will see below.");
		
		dresser.retrieveShirt();
		dresser.retrievePants();
		dresser.retrieveSocks();
		
		System.out.println("Remaining shirts: " + dresser.getShirts());
		System.out.println("Remaining pants: " + dresser.getPants());
		System.out.println("Remaining socks: " + dresser.getSocks());
	}
	
	public int getBedsideTables() {
		return bedsideTables;
	}
	
	public void makeBed() {
		bed.makeBed();
	}
	
	public void printBedInformation() {
		System.out.println("Here is a description of the bed: ");
		System.out.println("Color of sheets -- " + bed.getColorOfSheets());
		System.out.println("How clean the bed is -- " + bed.getBedCleanliness());
		System.out.printf("Measurements of the bed: %.2f x %.2f x %.2f\n", 
				bed.getDimensions().getHeight(), bed.getDimensions().getWidth(),
				bed.getDimensions().getDepth());
	}
	
	public void restockLaundry() {
		dresser.fillTheDresser();
		
		System.out.println("\nHere are the number of clothes available: ");
		System.out.println("Shirts: " + dresser.getShirts());
		System.out.println("Pants: " + dresser.getPants());
		System.out.println("Socks: " + dresser.getSocks());
	}
	
	public void setBedsideTables(int bedsideTables) {
		this.bedsideTables = bedsideTables;
	}
	
}
