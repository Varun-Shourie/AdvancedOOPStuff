
public class Dimension {

	private double height;
	private double width;
	private double depth;
	
	public Dimension() {
		this(0.0,0.0,0.0);
	}
	
	public Dimension(double height, double width) {
		this(height, width, 0.0);
	}
	
	public Dimension(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getDepth() {
		return depth;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	
}
