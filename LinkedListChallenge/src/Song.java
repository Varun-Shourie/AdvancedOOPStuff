
public class Song {

	private String title;
	// double - represents minutes. So 1 m 30 s represents 1.5 m.
	private double duration;
	private boolean isInPlaylist;
	
	public Song(String title, double duration) {
		this.title = title;
		this.duration = duration;
		this.isInPlaylist = false;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public boolean getIsInPlaylist() {
		return isInPlaylist;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public void setIsInPlaylist(boolean isInPlaylist) {
		this.isInPlaylist = isInPlaylist;
	}
	
	@Override
	public String toString() {
		return title + ": " + duration;
	}
}
