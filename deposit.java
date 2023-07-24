
import java.util.Scanner;
class Deposit {
    int amt = 0;

    public int userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to be deposited: ");
        amt = scanner.nextInt();
        if (amt <= 0) {
            System.out.println("Invalid Deposit Amount");
            return userInput();
        } else {
            return amt;
        }
    }
}