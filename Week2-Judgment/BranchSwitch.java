import java.util.Scanner;

/**
 * 分支switch
 */
public class BranchSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        switch (type){
            case 1:
            case 2:
                System.out.println("你好");
                break;
            case 3:
                System.out.println("晚上好");
            case 4:
                System.out.println("再见");
                break;
            default:
                System.out.println("啊？什么啊？");
                break;
        }
    }
}
