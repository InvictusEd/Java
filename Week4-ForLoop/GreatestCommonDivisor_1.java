import java.util.Scanner;

/**
 * 求最大公约数
 */
public class GreatestCommonDivisor_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = 1;
        for ( int i = 2; i <= a && i <= b; i++)
        {
            if ( a % i == 0 && b % i ==0 )
            {
                gcd = i;
            }
        }
        System.out.println(a+"和"+b+"的最大公约数是"+gcd);
    }
}
