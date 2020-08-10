import java.util.ListIterator;

public class PlaylistStream {

	private Playlist playlist;
	
	public PlaylistStream(String name) {
		playlist = new Playlist(name);
	}
	
	public static void main(String[] args) {
		PlaylistStream playlistStream = new PlaylistStream("Varun's Playlist");
		
		playlistStream.createSamplePlaylist();
		
		playlistStream.executeMenu();
	}
	
	// Creates a playlist with approximately five Daft Punk songs and one Kanye West song. 
	private void createSamplePlaylist() {
		playlist.createPlaylist();
	}
	
	// Executes the menu system as per the wishes of the user. 
	private void executeMenu() {
		ListIterator<Song> listIterator = playlist.getSongList().listIterator();
		
		boolean isDirectionForward = true;
		
		// Avoids the NoSuchElementException by cycling to the first element. 
		listIterator.next();
		
		while(true) {
			
			if(playlist.getSongList().isEmpty()) {
				
				quit();
			}
				
			
			System.out.printf("\n\t\t%s - Menu\n", playlist.getName());
			System.out.print("\n1 - Show the songs in the playlist.\n" +
						"2 - Skip forward to the next song.\n" +
						"3 - Skip backwards to the previous song.\n" +
						"4 - Replay the current song.\n" +
						"5 - Remove the current song from the playlist.\n" + 
						"Any other number - quit the playlist.\n\n");
			
			int choice = Utilities.readInteger("Please enter a number (1-5): ");
			
			switch(choice) {
			case 1:
				playlist.showSongs();
				break;
				
			case 2:
				isDirectionForward = moveToNextSong(listIterator, isDirectionForward);
				break;
				
			case 3:
				isDirectionForward = moveToPreviousSong(listIterator, isDirectionForward);
				break;
				
			case 4:
				isDirectionForward = repeatSong(listIterator, isDirectionForward);
				break;
				
			case 5:
				removeSong(listIterator, isDirectionForward);
				break;
				
			default:
				quit();
			}
		}
		
		
	}
	
	// Moves the playlist to the next song while checking for what direction the playlist
	// was moving before. 
	public boolean moveToNextSong(ListIterator<Song> listIterator, boolean isDirectionForward) {
		
		if(!isDirectionForward && listIterator.hasNext()) {
			listIterator.next();
			
			isDirectionForward = true;
		}
		
		moveToNextSong(listIterator);
		
		return isDirectionForward;
	}
	
	// Completes the final "move" to the next song. 
	private void moveToNextSong(ListIterator<Song> listIterator) {
		if(listIterator.hasNext()) {
			System.out.printf("\nForwarded to %s.\n", listIterator.next().toString());
		}
		else
			System.out.printf("\nYou have reached the end of the playlist. Please go back. \n");
	}
	
	// Moves to the previous song while checking for what direction the playlist was moving in
	// before. 
	public boolean moveToPreviousSong(ListIterator<Song> listIterator, boolean isDirectionForward) {
		if(isDirectionForward && listIterator.hasPrevious()) {
			listIterator.previous();
			isDirectionForward = false;
		}
		
		moveToPreviousSong(listIterator);
		
		return isDirectionForward;
	}
	
	private void moveToPreviousSong(ListIterator<Song> listIterator) {
		if(listIterator.hasPrevious()) {
			System.out.printf("\nRewinded to %s.\n", listIterator.previous().toString());
		}
		else
			System.out.printf("\nYou are at the beginning of the playlist. Please go forward. \n");
	}
	
	public void printSong(ListIterator<Song> listIterator, int methodNo) {
		if(methodNo == 1) {
			listIterator.previous();
			System.out.printf("\nCurrently on song %s.\n", listIterator.next().toString());
		}
		else if(methodNo == 2) {
			listIterator.next();
			System.out.printf("\nCurrently on song %s.\n", listIterator.previous().toString());
		}
	}
	
	public void removeSong(ListIterator<Song> listIterator, boolean isDirectionForward) {
		listIterator.remove();
		System.out.print("This song has been removed.\n");
		
		if(listIterator.hasNext()) 
			System.out.print("\nNow playing " + listIterator.next().toString() + ".\n");
		else if(listIterator.hasPrevious()) 
			System.out.print("\nNow playing " + listIterator.previous().toString() + ".\n");
	}
	
	public boolean repeatSong(ListIterator<Song> listIterator, boolean isDirectionForward) {
		if(isDirectionForward && listIterator.hasNext()) {
			printSong(listIterator, 1);
			isDirectionForward = true;
		}
		else if(!isDirectionForward && listIterator.hasNext()) {
			printSong(listIterator, 2);
			isDirectionForward = false;
		}
		else if(!isDirectionForward && listIterator.hasPrevious()) {
			printSong(listIterator, 2);
			isDirectionForward = false;
		}
		else if(isDirectionForward && listIterator.hasPrevious()) {
			printSong(listIterator, 1);
			isDirectionForward = true;
		}
		else if(!listIterator.hasNext()) {
			printSong(listIterator, 1);
			isDirectionForward = true;
		}
		else if(!listIterator.hasPrevious()) {
			printSong(listIterator, 2);
			isDirectionForward = false;
		}
		
		return isDirectionForward;
	}
	
	public void quit() {
		System.out.print("\n\nPlaylist terminated. Please press Enter to exit the application.");
		Utilities.getScanner().nextLine();
		System.exit(0);
	}

}
