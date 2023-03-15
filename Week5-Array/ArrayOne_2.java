import java.util.Scanner;

/**
 * 输出大于平均数的数,用户定义数组大小
 */
public class ArrayOne_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int cnt = 0;
        cnt = in.nextInt();
        if(cnt > 0) {
            int[] numbers = new int[cnt];
            for(int i = 0; i < cnt; i++)
            {
                numbers[i] = in.nextInt();
                sum += numbers[i];
            }
            double avg = sum / cnt;
            for(int i = 0; i < cnt; i++)
            {
                if(numbers[i] > avg)
                {
                    System.out.println(numbers[i]);
                }
            }
            //数组更好的遍历形式,写成具有可扩展性的代码
            for(int i = 0; i < numbers.length; i++)
            {
                if (numbers[i] > avg)
                {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
