/**
 * Java语言在调用函数时，只能传值给函数
 */
public class SwapFunction {
    //a, b是参数
    public static void swap(int a, int b)
    {
        int t;
        t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        //a, b是值
        swap(a, b);
        System.out.println("a="+a+" b="+b);
    }
}
