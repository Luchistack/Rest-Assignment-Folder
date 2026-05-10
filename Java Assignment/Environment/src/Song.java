public class Song {
    private String title;
    private String artist;


    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    public void playSong(){
        System.out.println("Playing " + title + " By " + artist);
    }
    @Override
    public String toString(){
        return "Song{" +
                "titles='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
     }
}
