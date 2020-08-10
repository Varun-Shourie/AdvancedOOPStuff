import java.util.LinkedList;
import java.util.Collections;

public class League<T extends Sport> {

	private LinkedList<Team<T>> rankedList;
	private String name;
	
	public League(String name) {
		this.name = name;
		this.rankedList = new LinkedList<>();
	}
	
	public boolean addTeam(Team<T> team) {
		for(Team<T> t : rankedList) {
			if(t.getName().equalsIgnoreCase(team.getName())) {
				return false;
			}
		}
		
		if(rankedList.contains(team)) {
			return false;
		}
		else {
			this.rankedList.add(team);
			return true;
		}
		
	}
	
	public void rank() {
		Collections.sort(rankedList);
		
		System.out.println("League rankings for the " + this.name + " league.");
		
		for(Team<T> t : rankedList) {
			System.out.println(t.getName() + ": " + t.rank());
		}
	}
	
}
