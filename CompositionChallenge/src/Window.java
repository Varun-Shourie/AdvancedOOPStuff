
public class Window {

	private Dimension dimensions;
	private String typeOfShutters;
	private int panes;
	private int stains;
	
	public Window() {
		this(new Dimension(4,5,0), "Plantation Shutters", 8, 1);
	}
	
	public Window(String typeOfShutters, int panes, int stains) {
		this(new Dimension(4,5,0), typeOfShutters, panes, stains);
	}
	
	public Window(Dimension dimensions, String typeOfShutters, int panes, int stains) {
		this.dimensions = dimensions;
		this.typeOfShutters = typeOfShutters;
		this.panes = panes;
	}
	
	public void cleanWindow() {
		setStains(0);
		
		System.out.println("The window is all clean now!!");
	}
	
	public Dimension getDimensions() {
		return dimensions;
	}
	
	public String getTypeOfShutters() {
		return typeOfShutters;
	}
	
	public int getPanes() {
		return panes;
	}
	
	public int getStains() {
		return stains;
	}
	
	public void setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
	}
	
	public void setTypeOfShutters(String typeOfShutters) {
		this.typeOfShutters = typeOfShutters;
	}
	
	public void setPanes(int panes) {
		this.panes = panes;
	}
	
	public void setStains(int stains) {
		this.stains = stains;
	}
}
