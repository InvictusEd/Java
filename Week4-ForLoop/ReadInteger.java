import java.util.Scanner;

/**
 * 念整数
 */
public class ReadInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int temp;
        int digit = 0;
        int sign = 1;
        int count = 1;
        int time = 0;
        temp = number % 10;
        if ( temp == 0 )
        {
            time = 1;
        }
        while ( number != 0 )
        {
            temp = number % 10;
            number = number / 10;
//            System.out.print(temp+" ");
            digit = temp+(digit*10);
//            System.out.println(digit);
        }
        if ( digit < 0)
        {
            sign = -1;
            System.out.print("fu"+" ");
        }
        digit *= sign;
        while ( digit != 0)
        {
            temp = digit % 10;
            digit = digit / 10;
            if ( count == 1) {
                switch (temp) {
                    case 0:
                        System.out.print("ling");break;
                    case 1:
                        System.out.print("yi");break;
                    case 2:
                        System.out.print("er");break;
                    case 3:
                        System.out.print("san");break;
                    case 4:
                        System.out.print("si");break;
                    case 5:
                        System.out.print("wu");break;
                    case 6:
                        System.out.print("liu");break;
                    case 7:
                        System.out.print("qi");break;
                    case 8:
                        System.out.print("ba");break;
                    case 9:
                        System.out.print("jiu");break;
                }
                count = 0;
                continue;
            }
            switch ( temp )
            {
                case 0:
                    System.out.print(" ling");break;
                case 1:
                    System.out.print(" yi");break;
                case 2:
                    System.out.print(" er");break;
                case 3:
                    System.out.print(" san");break;
                case 4:
                    System.out.print(" si");break;
                case 5:
                    System.out.print(" wu");break;
                case 6:
                    System.out.print(" liu");break;
                case 7:
                    System.out.print(" qi");break;
                case 8:
                    System.out.print(" ba");break;
                case 9:
                    System.out.print(" jiu");break;
            }
        }
        if ( time == 1)
        {
            System.out.print(" ling");
        }
    }
}
