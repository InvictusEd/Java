package clock5;

public class Clock {
    private Display hour = new Display(24);
    private Display minute = new Display(60);
    private Display second = new Display(60);


    /**
     * 初始化时间
     * @param hour 初始的小时
     * @param minute 初始的分钟数
     * @param second 初始的秒数
     */
    public Clock(int hour, int minute, int second) {
        this.hour.writeValue(hour);
        this.minute.writeValue(minute);
        this.second.writeValue(second);
    }


    /**
     * tick一下，时间走1秒
     */
    public void tick() {
        this.second.increase();
        if ( this.second.getValue()==0 ) {
            this.minute.increase();
            if ( this.minute.getValue()==0 ) {
                this.hour.increase();
            }
        }
    }


    /**
     * 返回一个String的值，以“hh:mm:ss“的形式表示当前时间。不足两位时补0。如“00:01:22"。
     * @return hh:mm:ss
     */
    public String toString() {
        return String.format("%02d:%02d:%02d\n", this.hour.getValue(), this.minute.getValue(), this.second.getValue());
    }
}