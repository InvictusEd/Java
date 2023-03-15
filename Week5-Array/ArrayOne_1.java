import java.util.Scanner;

/**
 * 输出大于平均数的数
 */
public class ArrayOne_1 {
    public static void main(String[] args) {
        int x;
        double sum = 0;
        int cnt = 0;
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[100];
        x = in.nextInt();
        while(x != -1)
        {
            numbers[cnt] = x;
            x = in.nextInt();
            sum += x;
            cnt++;
        }
        if(cnt > 0)
        {
            double avg = sum/cnt;
            for(int i = 0; i < cnt; i++)
            {
                if(numbers[i] > avg)
                {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
