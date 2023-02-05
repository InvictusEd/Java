import java.util.Scanner;

/**
 * 售货机
 */ 
public class VendingMachine {
    int price = 80;
    int balance;
    int total;

    void showPrompt()
    {
        System.out.println("Welcome!");
    }

    void showBalance()
    {
        System.out.println(balance);
    }

    void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    void getFood()
    {
        if( balance >= price ){
            System.out.println("Here you are");
            balance = balance - price;
            total = total + price;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();
        vm.balance = in.nextInt();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();
    }
}
