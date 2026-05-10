import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String email;
    private List<Playlist> playlist = new ArrayList<>();

    public User(String userName, String email){

        this.userName = userName;
        this.email = email;
    }
    public void createPlaylist(Playlist playlist){
          this.playlist.add(playlist);
    }
}
