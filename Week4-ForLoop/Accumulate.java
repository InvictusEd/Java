import java.util.Scanner;

/**
 * 倒数累加
 */
public class Accumulate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
        for ( int i = 1; i<=n; i++ )
        {
            sum += 1.0/i;
        }
        System.out.println(sum);
        System.out.printf("%.2f",sum);
    }
}
