
import java.util.Scanner;

class Login {
    int ac, pw;

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HDFC Bank Account Number: ");
        ac = scanner.nextInt();
        System.out.print("Enter Password: ");
        pw = scanner.nextInt();
    }

    public void verify() {
        acceptInput();

        if (authenticate(ac, pw)) {
            System.out.println("Your HDFC Bank Account Login Successful!");
            BankingAccount b = new BankingAccount();
            System.out.println();
            System.out.println("Your Account Balance is: " + b.getBalance(ac) + " Rupees");
            System.out.println();
            Menu menu = new Menu();
            menu.showMenu(ac);
        } else {
            System.out.println("Incorrect Login Credentials!");
        }
    }

    private boolean authenticate(int acNumber, int password) {
        // Simulating authentication against stored user credentials
        return UserDatabase.isValidUser(acNumber, password);
    }
}
