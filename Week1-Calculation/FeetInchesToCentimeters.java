import java.util.Scanner;

/**
 * 英尺英寸转厘米
 */
public class FeetInchesToCentimeters {
    public static void main(String[] args) {
        int foot;
        double inch;
        foot = (int)(30/3.0);
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextDouble();
        System.out.println("foot="+foot+",inch="+inch);
        System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
    }
}
 