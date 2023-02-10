import java.util.Scanner;

/**
 * 求素数
 */
public class PrimeNumber_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        int n = 2;
        int count = 1;
        for (;count <= b;n++) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println("第"+count+"个素数是"+n);
                if (count >= a && count <= b) {
                    sum += n;
                }
                count++;
            }
        }
        System.out.println("第"+a+"个素数到第"+b+"个素数的和是"+sum);
    }
}
