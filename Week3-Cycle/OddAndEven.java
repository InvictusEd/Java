import java.util.Scanner;

/**
 * 数奇偶数，-1结束输入
 */
public class OddAndEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        int digit = in.nextInt();
        while (digit != -1) {
            int temp = digit % 2;
            if ( temp == 0 )
            {
                even = even + 1;
            }
            else
            {
                odd = odd + 1;
            }
            digit = in.nextInt();
        }
        System.out.println(odd+" "+ even);
    }
}
