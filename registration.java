
import java.util.Scanner;

class Registration {
    int ac, pw;

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HDFC Bank Account Number: ");
        ac = scanner.nextInt();
        System.out.print("Enter Password: ");
        pw = scanner.nextInt();
    }

    public void register() {
        acceptInput();

        if (UserDatabase.addUser(ac, pw)) {
            System.out.println("Registration Successful!");
        } else {
            System.out.println("Failed to register.");
        }

        goBackToMainMenu();
    }

    private void goBackToMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press any key to go back to the main menu...");
        scanner.nextLine();
    }
}