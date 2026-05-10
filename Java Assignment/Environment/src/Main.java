//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Playlist playlist1 = new Playlist("Afro");
        Playlist playlist2 = new Playlist("Areaye");
        Playlist playlist3 = new Playlist("Hiphop");

        Song song1 = new Song("Love Dont Cost No Dime", "Magix");
        Song song2 = new Song("Golibe", "Flavor");
        Song song3 = new Song("Dumebi", "Rema");

        song1.playSong();
        song2.playSong();
        song3.playSong();

        playlist1.addSong(song1);
        playlist2.addSong(song2);
        playlist3.addSong(song3);

        System.out.println(playlist1);
        System.out.println(playlist2);
        System.out.println(playlist3);


    }
}