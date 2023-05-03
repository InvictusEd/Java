import java.util.ArrayList;

/**
 * 对象数组，对象数组的for-each循环
 */

class Value {
    private int i;
    public void set(int i) { this.i = i; }
    public int get() { return i; }
    // 任何一个java类String
    public String toString() {
        return ""+i;
    }
}

public class ArrayOfObjects {
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
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
        Value v = new Value();
        v.set(10);
        System.out.println(v);

        ArrayList<String> a = new ArrayList<String>();
        a.add("first");
        a.add("second");
        for ( String s : a ) {
            System.out.println(s);
        }
          //for-each循环会改变数组元素的值
//        Value[] a = new Value[10];
//        for ( int i=0; i<a.length; i++ ) {
//            a[i] = new Value();
//            a[i].set(i);
//        }
//        for ( Value v : a ) {
//            System.out.println(v.get());
//            v.set(0);
//        }
//        for ( Value v : a ) {
//            System.out.println(v.get());
//        }
    }
}
