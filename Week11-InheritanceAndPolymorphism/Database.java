import java.util.ArrayList;

/**
 * 媒体数据库
 */
public class Database {
    private ArrayList<Item> listItem = new ArrayList<Item>();

    //多态变量，静态变量类型Item，把子类的对象交给父类变量叫做 ”向上造型“
    public void add(Item item) {
        listItem.add(item);
    }

    public void list() {
        for ( Item item : listItem ) {
            item.print();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("abc", "abc", 4, 60, "..."));
        db.add(new CD("def", "def", 4, 60, "..."));
        db.add(new DVD("xxx", "aaa", 60, "..."));
        db.add(new VideoGame("ddd", 10, true, "...", 4));
        db.list();
    }
}
