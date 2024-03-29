import java.util.Scanner;

/**
 * 求前50个素数
 */
public class ArrayTwo_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] primes = new int[50];
        primes[0] = 2;
        int cnt = 1;
        MAIN_LOOP:
        for ( int x=3; cnt<50; x++ )
        {
            for ( int i=0; i<cnt; i++ )
            {
                if ( x % primes[i] == 0 )
                {
                    continue MAIN_LOOP;
                }
            }
            primes[cnt++] = x;
        }
        for ( int k : primes )
        {
            System.out.println(k+" ");
        }
    }
}
