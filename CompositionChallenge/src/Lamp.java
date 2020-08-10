
public class Lamp {

	private int lightbulbs;
	private String lampshadeType;
	private double standLength;
	
	public Lamp() {
		this("Regular", 5.0);
	}
	
	public Lamp(String lampshadeType, double standLength) {
		this.lightbulbs = 1;
		this.lampshadeType = lampshadeType;
		this.standLength = standLength;
	}
	
	public void adjustStandLength(double newStandLength) {
		setStandLength(newStandLength);
	}
	
	public void replaceLampBulb() {
		if(this.lightbulbs == 0) {
			this.lightbulbs++;
		}
		else 
			System.out.println("You do not need to replace a lightbulb.");
	}

	public int getLightbulbs() {
		return lightbulbs;
	}

	public String getLampshadeType() {
		return lampshadeType;
	}

	public double getStandLength() {
		return standLength;
	}

	public void setLightbulbs(int lightbulbs) {
		this.lightbulbs = lightbulbs;
	}

	public void setLampshadeType(String lampshadeType) {
		this.lampshadeType = lampshadeType;
	}

	public void setStandLength(double standLength) {
		this.standLength = standLength;
	}
	
	
}
