package clock3;

/**
 * 封闭的访问属性和开放的访问属性
 * 私有是针对类的，不是针对对象的，在类中是公开的，本类以外不能访问。
 * 在一个编译单元.java中，只可以有一个类是public
 */
public class Clock {
    private Display hour = new Display(24);
    private Display minute = new Display(60);

    /**
     * Clock时钟的开始，包含输出
     */
    public void start() {
        while (true) {
            minute.increase();
            if ( minute.getValue()==0 ) {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();
    }
}
