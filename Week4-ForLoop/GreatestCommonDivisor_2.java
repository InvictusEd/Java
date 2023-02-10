import java.util.Scanner;

/**
 * 辗转相除法求最大公约数
 */
public class GreatestCommonDivisor_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int oa = a;
        int ob = b;
        while ( b!=0 )
        {
            int r = a % b;
            System.out.println(a+","+b+","+r);
            a = b;
            b = r;
        }
        System.out.println(oa+"和"+ob+"的最大公约数是"+a);
    }
}
