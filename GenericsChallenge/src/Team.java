
public class Team<T extends Sport> implements Comparable<Team<T>> {

	private String name;
	private int gamesWon;
	private int gamesLost;
	
	public Team(String name) {
		this(name, 0, 0);
	}
	
	public Team(String name, int gamesWon, int gamesLost) {
		this.name = name;
		
		adjustRanking(gamesWon, gamesLost);
	}
	
	public void adjustRanking(int gamesWon, int gamesLost) {
		if(gamesWon > 82 || gamesWon < 0 || gamesLost < 0 || gamesLost > 82) {
			System.out.println("Could not set games won and lost. Reset to default.");
		}
		else {
			this.gamesWon = gamesWon;
			this.gamesLost = gamesLost;
		}
	}
	
	@Override
	public int compareTo(Team<T> o) {
		if(this.gamesWon > o.gamesWon) {
			return 1;
		}
		else if(this.gamesWon < o.gamesWon) {
			return -1;
		}
		else return 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String rank() {
		return this.gamesWon + "-" + this.gamesLost;
	}
}
