import java.util.Scanner;

/**
 * 求素数
 */
public class PrimeNumber_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int isPrime = 1;
        for ( int i = 2; i<n; i++)
        {
            if ( n % i == 0)
            {
                isPrime = 0;
                System.out.println(n+"不是素数");
                break;
            }
        }
        if ( isPrime == 1 )
        {
            System.out.println(n+"是素数");
        }
        else
        {
            System.out.println(n+"不是素数");
        }
    }
}
