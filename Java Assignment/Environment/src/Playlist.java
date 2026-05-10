import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String playListName;
    private List<Song> songs = new ArrayList<>();

    public Playlist(String playListName){
        this.playListName = playListName;
    }
    public void addSong(Song song) {
         songs.add(song);
    }
    @Override
    public String toString(){
        return "Playlist{" + "playListName='" + playListName +  '\'' +
                ", songs=" + songs + "}";
    }
}