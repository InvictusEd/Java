/**
 * 函数调用
 * 函数要避免多个出口（return）
 */
public class FunctionCall {
    /**
     * 求和函数
     * @param a 起始数
     * @param b 终止数
     */
    public static void sum(int a, int b)
    {
        int i;
        int sum = 0;
        for ( i=a; i<=b; i++ )
        {
            sum += i;
        }
        System.out.println(a+"到"+b+"的和是"+sum);
    }

    /**
     * 最大值函数
     * @param a 第一个数
     * @param b 第二个数
     * @return 最大的数
     */
    public static int max(int a, int b)
    {
        int ret;
        if ( a>b )
        {
            ret = a;
        }
        else
        {
            ret = b;
        }
        return ret;
    }
    public static void f()
    {
        System.out.println("f()");
    }
    public static void main(String[] args) {
        f();
        sum(1, 10);
        sum(20, 30);
        sum(35, 45);
        //不同的参数
        int a = 5;
        int b = 6;
        int c;
        c = max(10, 12);
        c = max(a, b);
        c = max(a, 23);
        c = max(c, 23);
        c = max(max(c,a), max(5,b));
        System.out.println(max(a,b));
        max(12, 23);
    }
}

