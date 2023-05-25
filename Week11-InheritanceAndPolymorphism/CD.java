/**
 * CD类，继承了Item类
 */
public class CD extends Item {
    private String artist;
    private int numofTracks;


    public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.artist = artist;
        this.numofTracks = numofTracks;
    }

    @Override
    public String toString() {
        return "CD{" +
                "artist='" + artist + '\'' +
                ", numofTracks=" + numofTracks +
                '}';
    }


    public void print() {
        System.out.println("CD:"+super.title()+":"+artist);
    }
}
