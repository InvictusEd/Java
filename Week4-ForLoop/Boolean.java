import java.util.Scanner;

/**
 * 布尔值与判断素数
 */
public class Boolean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isPrime = true;
        for ( int i = 2; i<n; i++)
        {
            if ( n % i == 0)
            {
                isPrime = false;
                System.out.println(n+"不是素数");
                break;
            }
        }
        if ( isPrime )
        {
            System.out.println(n+"是素数");
        }
        else
        {
            System.out.println(n+"不是素数");
        }
    }
}
