/**
 * DVD类，继承了Item类
 */
public class DVD extends Item {
    private String director;

    public DVD(String title, String director, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        setTitle("b");
        this.director = director;
    }

    public void print() {
        System.out.println("DVD:");
        super.print();
        System.out.println(director);
    }
}
