import java.util.Scanner;

/**
 * 华氏度转摄氏度
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        int f;
        int c;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个华氏度温度:");
        f = in.nextInt();
        c = (int)((f - 32)/(9/5.0));
        System.out.println("摄氏度="+c);
    }
} 