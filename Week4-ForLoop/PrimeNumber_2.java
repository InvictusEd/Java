import java.util.Scanner;

/**
 * 求素数
 */
public class PrimeNumber_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int n = 2; n<100; n++) {
            int isPrime = 1;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime == 1) {
                System.out.print(n + " ");
            } else {
//                System.out.println(n + "不是素数");
            }
        }
    }
}
