/**
 * 字符串操作
 */
public class ObjectThree_2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcd";
        //比较字符串谁大谁小
        System.out.println(s1.compareTo(s2));
        System.out.println("abcd".compareTo(s2));
        //字符串长度
        System.out.println(s1.length());
        //字符串索引
        System.out.println(s1.charAt(0));
        //得到字串
        System.out.println(s2.substring(1));
        System.out.println(s1.substring(1, 3));
        //寻找字符
        System.out.println(s2.indexOf('a'));
        System.out.println(s2.indexOf("abc"));
        System.out.println(s2.indexOf('a', 1));
        /*s1.startsWith(t);     //是否以另一个子字符串开头
        s1.endsWith(t);         //是否以另一个子字符串结尾
        s1.trim();              //把字符串两端的空格删掉
        s1.replace(c1,c2);      //把字符串中所有的c1都换成c2
        s1.toLowerCase();       //变小写字母
        s1.toUpperCase();*/     //变大写字母
        //这些操作都不能改变字符串自己
    }
}
