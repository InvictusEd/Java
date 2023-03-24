/**
 * 本地变量是定义在块内的
 * 它可以是定义在函数的块内
 * 也可以定义在语句的块内
 * 甚至可以随便拉一对大括号来定义变量
 * 程序运行进入这个块之前，其中的变量不存在，离开这个块，其中的变量就消失了
 * 块外面定义的变量在里面仍然有效
 * 不能在一个块内定义同名的变量，也不能定义块外面定义过的变量
 * 本地变量不会被默认初始化
 * 参数在进入函数的时候被初始化了
 */
public class LocalVariable {
    public static int factor(int i)
    {
        if ( i == 1 )
            return i;
        return i*factor(i-1);
    }

    public static void main(String[] args) {
        int k = factor(3);
        System.out.println(k);
        {
            int hh = 0;
            System.out.println(hh);
        }
        //离开大括号后hh不存在了
    }
}
