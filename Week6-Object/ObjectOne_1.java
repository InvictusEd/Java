/**
 * 字符类型
 */
public class ObjectOne_1 {
    public static void main(String[] args) {
        char c = 'a';
        char a = '\u0041';
        System.out.println(a);
        System.out.println(c);
        System.out.println((int)c);
        //大小写转换
        char d = (char)(c+'A'-'a');
        System.out.println(d);
        System.out.println('A' > 'B');
        System.out.println('a' > 'A');
        System.out.println('汉' > 'a');
    }
}
