import java.util.Scanner;

/**
 * 初识for循环
 */
public class ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int i = 1;
        int factor = 1;

        for ( int i = 1; i<=n; i=i+1 )
        {
            factor = factor * i;
        }
        System.out.println(factor);
    }
}
