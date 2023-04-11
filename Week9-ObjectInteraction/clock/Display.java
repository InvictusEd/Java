package clock;

/**
 * 对象交互，Display类
 */
public class Display {
    private int value = 0;
    private int limit = 0;

    /**
     * Display类的构造函数
     * @param limit 给定一个上限值，“60分钟，24小时”
     */
    public Display(int limit) {
        this.limit = limit;
    }

    /**
     * value的自增，分钟或小时+1
     */
    public void increase() {
        value++;
        if ( value==limit ) {
            value = 0;
        }
    }

    /**
     * 取出value
     * @return value
     */
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
    Display d = new Display(24);
    for ( ;; ) {
        d.increase();
        System.out.println(d.getValue());
        }
    }
}
