
import java.util.Scanner;

class BankingApp {
    public static void main(String[] args) {
        System.out.println("Welcome to HDFC Bank!");

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Press 1 for Login");
            System.out.println("Press 2 for Registration");
            System.out.println("Press 0 to Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Login login = new Login();
                    login.verify();
                    break;
                case 2:
                    Registration registration = new Registration();
                    registration.register();
                    break;
                case 0:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
