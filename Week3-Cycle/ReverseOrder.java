import java.util.Scanner;

/**
 * 数的逆序
 */
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        number = in.nextInt();
        int result = 0;
        while ( number > 0 ) {
            int digit = number % 10;
            result = result*10+digit;
            System.out.print(digit);
            number = number / 10;
        }
        System.out.println();
        System.out.println(result);
    }
}
