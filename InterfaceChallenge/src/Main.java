
import java.util.*;

public class Main {

	public static void main(String[] args) {
		writeLog();
	}
	
	private static void writeLog() {
		ISaveable jones = new Player("Indiana Jones");
		ArrayList<String> jonesLog = (ArrayList<String>) jones.write();
		
		// jones.getName(); == does not work.
		System.out.println(((Player) jones).getName());
		
		
		System.out.println(jones.toString());
		jones.read(jonesLog);
		
		for(String s : jonesLog) {
			System.out.println(s);
		}
		
		ISaveable godzilla = new Monster("Godzilla");
		ArrayList<String> godzillaLog = (ArrayList<String>) godzilla.write();
		
		System.out.println(godzilla.toString());
		godzilla.read(godzillaLog);
		
		for(String s : godzillaLog) {
			System.out.println(s);
		}
	}
}
