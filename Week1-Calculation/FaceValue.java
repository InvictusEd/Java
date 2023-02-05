import java.util.Scanner;
 
/**
 * 票面金额
 */
public class FaceValue {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner in = new Scanner(System.in);
        int amount = 100;
        int price = 0;
        System.out.println("请输入票面:");
        amount = in.nextInt();
        System.out.println("请输入金额:");
        price = in.nextInt();
        System.out.println(amount+" - "+price+" = "+(amount - price));
    }
}
 