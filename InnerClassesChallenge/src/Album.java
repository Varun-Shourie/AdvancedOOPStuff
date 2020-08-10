
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dev on 18/09/15.
 * 
 * Challenge: Modify the playlist so that the Album uses an inner class. 
 * 
 * Instead of using an ArrayList to hold its tracks, it will use an inner class called songList.
 * The inner songList class will use an ArrayList and will provide a method to add a song.
 * 
 * It will also provide findSong() methods which will be used by the containing Album class to
 * add songs to the playlist. 
 * 
 * Neither the Song class or the Main class should be changed. 
 * 
 */
public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }
    
    public boolean addSong(String title, double duration) {
    	return songList.addSong(title, duration);
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if((index >= 0) && (index < songList.getSongs().size())) {
            playList.add(songList.getSongs().get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songList.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {
    	
    	private ArrayList<Song> songs;
    	
    	public SongList() {
    		songs = new ArrayList<>();
    	}
    	
    	public ArrayList<Song> getSongs() {
    		return this.songs;
    	}
    	
    	public boolean addSong(String title, double duration) {
            if(findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }
    	
    	private Song findSong(String title) {
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }
    }

}
