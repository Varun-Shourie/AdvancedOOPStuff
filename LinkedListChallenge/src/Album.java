import java.util.ArrayList;

public class Album {

	private ArrayList<Song> songList;
	private String albumName;
	private String artistName;
	
	public Album(String artistName, String albumName) {
		songList = new ArrayList<>();
		this.albumName = albumName;
		this.artistName = artistName;
	}
	
	public static Album createDaftPunkAlbum() {
		Album album = new Album("Daft Punk", "Discovery");
		
		album.addSong(new Song("One More Time", 5.33));
		album.addSong(new Song("Aerodynamic", 3.31));
		album.addSong(new Song("Digital Love", 5.02));
		album.addSong(new Song("Harder Better...", 3.67));
		album.addSong(new Song("Crescendolls", 3.51));
		album.addSong(new Song("Nightvision", 1.65));
		album.addSong(new Song("Superheroes", 3.98));
		album.addSong(new Song("High Life", 3.31));
		album.addSong(new Song("Something About Us", 3.91));
		album.addSong(new Song("Voyager", 3.78));
		album.addSong(new Song("Veridis Quo", 5.75));
		album.addSong(new Song("Short Circuit", 3.50));
		album.addSong(new Song("Face to Face", 4.00));
		album.addSong(new Song("Too Long", 10.00));
		
		return album;
	}
	
	public static Album createKanyeAlbum() {
		Album album = new Album("Kanye West", "Lift Yourself");
		
		album.addSong(new Song("Lift Yourself", 4.20));
		
		return album;
	}
	
	public void addSong(Song song) {
		songList.add(song);
	}
	
	public ArrayList<Song> getSongList() {
		return songList;
	}
	
	public String getAlbumName() {
		return albumName;
	}
	
	public String getArtistName() {
		return artistName;
	}
	
	public void removeSong() {
		showSongs();
		System.out.print("\n");
		
		int song = Utilities.readInteger("Enter song number to remove: ");
		
		if(song > 1 && song <= songList.size()) {
			Song tmpSong = songList.get(song-1);
			songList.remove(tmpSong);
			System.out.printf("\nSong %s was removed from album %s.\n\n", tmpSong.getTitle(), getAlbumName());
		}
		else 
			System.out.print("\nInvalid number. Please try again.\n\n");
		
	}
	
	public void setAlbum(ArrayList<Song> album) {
		this.songList = album;
	}
	
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	
	public void setArtistName(String artistName) {
		this.artistName = artistName;
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
