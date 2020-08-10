import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

	private String name;
	private LinkedList<Song> songList;
	
	
	public Playlist(String name) {
		this.name = name;
		songList = new LinkedList<>();
	}
	
	public void addSong(Album album) {
		album.showSongs();
		
		int song = Utilities.readInteger("\nEnter song number to add to the playlist: ");
		
		if(song > 0 && song <= album.getSongList().size()) {
			Song tmpSong = album.getSongList().get(song-1);
			
			if(!tmpSong.getIsInPlaylist()) {
				songList.add(tmpSong);
				tmpSong.setIsInPlaylist(true);
				System.out.printf("\nSong %s was added to playlist %s.\n\n", tmpSong.getTitle(), name);
			}
			else 
				System.out.printf("\nSong %s is already in playlist %s.\n\n", tmpSong.getTitle(), name);
		}
		else 
			System.out.print("\nInvalid number. Please try again.\n\n");
	}
	
	public void createPlaylist() {
		Album daftPunk = Album.createDaftPunkAlbum();
		Album kanye = Album.createKanyeAlbum();
		
		for(int i = 0; i < 5; i++)
			addSong(daftPunk);
		
		addSong(kanye);
	}
	
	public LinkedList<Song> getSongList() {
		return songList;
	}
	
	public String getName() {
		return name;
	}
	
	public void showSongs() {
		int songNumber = 0;
		
		Utilities.printFormatted("\nNumber", "Song Title", "Duration");
		
		for(Song s : songList) {
			Utilities.printFormatted(songNumber+1, s.getTitle(), s.getDuration());
			songNumber++;
		}
	}
}
