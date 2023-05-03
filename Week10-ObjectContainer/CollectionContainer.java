import java.util.HashSet;

/**
 * 集合容器
 */
public class CollectionContainer {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<String>();
        s.add("first");
        s.add("second");
        s.add("first");
        System.out.println(s);
    }
}
