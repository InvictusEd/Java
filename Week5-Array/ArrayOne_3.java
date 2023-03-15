import java.util.Scanner;

/**
 * 数组不能直接赋值给另一个数组，必须遍历赋值
 */
public class ArrayOne_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {1,2,3,4};
        //int[] b = a;  b和a都成为了这一个数组的管理者，数组变量没有所有者
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++)
        {
            b[i] = a[i];
        }
        boolean isEqu = true;
        for (int i = 0; i < b.length; i++)
        {
            if (a != b)
            {
                isEqu = false;
                break;
            }
        }
        System.out.println(isEqu);
    }
}
