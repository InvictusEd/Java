import java.util.Scanner;

/**
 * while循环数一串数的个数
 */
public class Counting_while {
    public static void main(String[] args) {
//        初始化
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count = count + 1;
            System.out.println("number="+number+";count="+count);
        }
        System.out.println(count);
    }
}
