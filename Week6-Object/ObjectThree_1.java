import java.util.Scanner;

/**
 * 字符串变量
 */
public class ObjectThree_1 {
    public static void main(String[] args) {
        String s = new String("Hello");
        System.out.println(s+" world");
        System.out.println(s+12+24);
        System.out.println(s+(12+24));
        Scanner in = new Scanner(System.in);
        // next分界的标志是空格
        s = in.next();
        System.out.println(s);
        //判断字符串的内容是不是等于bye, ==是比较管理者，管理同一个字符串才是true
        s = "bye";
        System.out.println(s.equals("bye"));
    }
}
