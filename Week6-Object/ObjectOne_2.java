/**
 * 逃逸字符
 */
public class ObjectOne_2 {
    public static void main(String[] args) {
        // 逃逸字符\b只有在操作系统的console才作用，回退一格
        System.out.println("abc\bd");
        //制表符\t
        System.out.println("abc\t123");
        System.out.println("a\t123");
        // \n换行，\r回车
        System.out.println("abc\n123");
        System.out.println("abc\r123");
    }
}
