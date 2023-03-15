import java.util.Scanner;

/**
 * 遍历搜索数组
 */
public class ArrayTwo_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = {1, 2, 3, 4, 5, 6};
        int x = in.nextInt();
        int loc = -1;
        boolean found = false;
        for ( int i=0; i<data.length; i++ )
        {
            if ( x==i )
            {
                loc = i;
                break;
            }
        }
        //foreach循环
        for ( int k : data)
        {
            if ( k == x )
            {
                found = true;
            }
        }
        //foreach优势在于数组遍历
        for ( int k : data )
        {
            System.out.println(k);
        }
        if ( loc > -1 )
        {
            System.out.println(x+"是第"+(loc+1)+"个");
        }
        else
        {
            System.out.println("不在其中");
        }
    }
}
