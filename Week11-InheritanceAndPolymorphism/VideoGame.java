/**
 * VideoGame类，继承了Item类
 */
public class VideoGame extends Item {
    private int numberOfPlayers;

    public VideoGame(String title, int playingTime, boolean gotIt, String comment, int numberOfPlayers) {
        super(title, playingTime, gotIt, comment);
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public void print() {
        System.out.println("VideoGame");
        super.print();
    }
}
