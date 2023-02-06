import java.util.Scanner;

/**
 * 计算输入数的平均数，-1结束输入
 */
public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
//        number = in.nextInt();
//        while (number != -1)
//        {
//            sum += number;
//            count = count + 1;
//            number = in.nextInt();
//        }
        do {
            number = in.nextInt();
            if(number!=-1)
            {
                sum += number;
                count = count + 1;
            }
        } while (number!=-1);
        if(count > 0)
        {
            System.out.println("平均数="+(double)sum/count);
        }
    }
}
