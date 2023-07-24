
import java.util.Scanner;

class Menu {
    public void showMenu(int acNumber) {
        int selectedOption;
        BankingAccount b = new BankingAccount();

        System.out.println("Please Select an option below:");
        System.out.println("Press 1 to Deposit Amount.");
        System.out.println("Press 2 to Withdraw Amount.");
        System.out.println("Press 3 to View Balance");
        System.out.println("Press any key to Logout");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Press any key: ");
        selectedOption = scanner.nextInt();

        switch (selectedOption) {
            case 1:
                Deposit d = new Deposit();
                int depamt = d.userInput();
                b.add(acNumber, depamt);
                showMenu(acNumber);
                break;
            case 2:
                System.out.print("Please Enter the amount to withdraw: ");
                int withamt = scanner.nextInt();
                b.withdraw(acNumber, withamt);
                showMenu(acNumber);
                break;
            case 3:
                System.out.println("Your Account Balance is " + b.getBalance(acNumber) + " Rupees");
                System.out.println();
                showMenu(acNumber);
                break;
            default:
                System.out.println("Transaction Ended, Your HDFC Bank Account Logout Successfully!");
                System.exit(0);
                break;
        }
    }
}
