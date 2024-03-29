import java.util.ArrayList;

/**
 * 顺序容器
 */
public class SequenceContainer {
    private ArrayList<String> notes = new ArrayList<String>();

    public void add(String s) {
        notes.add(s);
    }

    public void add(int location, String s) {
        notes.add(location, s);
    }

    public int getSize() {
        return notes.size();
    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
//        for ( int i=0; i<notes.size(); i++) {
//            a[i] = notes.get(i);
//        }
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
        SequenceContainer nb = new SequenceContainer();
        nb.add("first");
        nb.add("second");
        nb.add(1,"third");
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(0));
        System.out.println(nb.getNote(1));
        nb.removeNote(1);
        String[] a = nb.list();
        for ( String s : a ) {
            System.out.println(s);
        }
    }
}
