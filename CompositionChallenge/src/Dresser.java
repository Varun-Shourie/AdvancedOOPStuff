import java.util.Scanner;

public class Dresser {

	private Dimension dimensions;
	private int drawers;
	private int shirts;
	private int pants;
	private int socks;
	
	public Dresser() {
		this(new Dimension(5,2,3), 3, 10, 10, 10);
		
		Main.scanner = new Scanner(System.in);
	}
	
	public Dresser(Dimension dimensions, int drawers, int shirts, int pants, int socks) {
		this.dimensions = dimensions;
		this.drawers = drawers;
		this.shirts = shirts;
		this.pants = pants;
		this.socks = socks;
		
		Main.scanner = new Scanner(System.in);
	}
	
	public void cleanTheDresser() {
		System.out.println("All cleaned now!");
	}
	
	public void fillTheDresser() {
		boolean hasNextInt = false;
		int shirts = 0;
		int pants = 0;
		int socks = 0;
		
		System.out.print("How many shirts did you wash? >> ");
		hasNextInt = Main.scanner.hasNextInt();
		
		if(hasNextInt) {
			shirts = Main.scanner.nextInt();
			Main.scanner.nextLine();
		}
		else {
			System.out.println("Invalid input.");
			return;
		}
		
		System.out.print("How many pants did you wash? >> ");
		hasNextInt = Main.scanner.hasNextInt();
		
		if(hasNextInt) {
			pants = Main.scanner.nextInt();
			Main.scanner.nextLine();
		}
		else {
			System.out.println("Invalid input.");
			return;
		}
		
		System.out.print("How many socks did you wash? >> ");
		hasNextInt = Main.scanner.hasNextInt();
		
		if(hasNextInt) {
			socks = Main.scanner.nextInt();
			Main.scanner.nextLine();
		}
		else {
			System.out.println("Invalid input.");
			return;
		}
		
		this.shirts += shirts;
		this.pants += pants;
		this.socks += socks;
	}
	
	public Dimension getDimensions() {
		return dimensions;
	}
	
	public int getDrawers() {
		return drawers;
	}
	
	public int getShirts() {
		return shirts;
	}
	
	public int getPants() {
		return pants;
	}
	
	public int getSocks() {
		return socks;
	}
	
	public void retrieveShirt() {
		if(this.shirts - 1 >= 0)
			this.shirts = this.shirts - 1;
		else
			System.out.println("You are out of shirts already.");
	}
	
	public void retrievePants() {
		if(this.pants - 1 >= 0) 
			this.pants = this.pants - 1;
		else 
			System.out.println("You are out of pants already.");
	}
	
	public void retrieveSocks() {
		if(this.socks - 2 >= 0)
			this.socks = this.socks - 2;
		else
			System.out.println("You are out of socks already.");
	}
	
	public void setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
	}
	
	public void setDrawers(int drawers) {
		this.drawers = drawers;
	}
	
	public void setShirts(int shirts) {
		this.shirts = shirts;
	}
	
	public void setPants(int pants) {
		this.pants = pants;
	}
	
	public void setSocks(int socks) {
		this.socks = socks;
	}
	
}
