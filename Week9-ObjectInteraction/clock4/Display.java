package clock4;

/**
 * 对象交互，Display类
 * 类变量，类函数 static，是属于这个类的，不属于任何具体的对象
 * static函数只能调用static函数和static成员变量
 * static函数和成员变量通过类的名字去访问，也可以通过对象的名字去访问，但并不能获得那个对象的具体信息
 */
public class Display {
    private int value = 0;
    private int limit = 0;
    private static int step = 1;

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

    public static void f() {
        
    }

    public static void main(String[] args) {
        Display d1 = new Display(10);
        Display d2 = new Display(20);
        d1.step = 2;
        System.out.println(d1.step);
        System.out.println(d2.step);
        Display.step = 3;
        System.out.println(d1.step);
        System.out.println(d2.step);
    }
}
