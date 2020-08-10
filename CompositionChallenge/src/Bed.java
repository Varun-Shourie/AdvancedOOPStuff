
public class Bed {

	private Dimension dimensions;
	private String colorOfSheets;
	private String cleanliness;
	
	public Bed() {
		this(new Dimension(6, 3, 1.5), "White", "Twin");
	}
	
	private Bed(double height, double width, double depth, String colorOfSheets, String bedClassification) {
		this(new Dimension(height, width, depth), colorOfSheets, bedClassification);
	}
	
	public Bed(Dimension dimensions, String colorOfSheets, String cleanliness) {
		this.dimensions = dimensions;
		this.colorOfSheets = colorOfSheets;
		this.cleanliness = cleanliness;
	}
	
	public Dimension getDimensions() {
		return dimensions;
	}
	
	public String getColorOfSheets() {
		return colorOfSheets;
	}
	
	public String getBedCleanliness() {
		return cleanliness;
	}
	
	public void makeBed() {
		setCleanliness("Clean");
		
		System.out.println("The cleanliness of the bed can now be characterized as : " + this.cleanliness);
	}
	
	public void setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
	}
	
	public void setColorOfSheets(String colorOfSheets) {
		this.colorOfSheets = colorOfSheets;
	}
	
	public void setCleanliness(String cleanliness) {
		this.cleanliness = cleanliness;
	}
	
}
