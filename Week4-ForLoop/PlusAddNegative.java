import java.util.Scanner;

/**
 * 正负累加
 */
public class PlusAddNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
        int sign = 1;
        for ( int i = 1; i<=n; i++ )
        {
            sum += sign*1.0/i;
            sign = -sign;
        }
        System.out.println(sum);
        System.out.printf("%.2f",sum);
    }
}
