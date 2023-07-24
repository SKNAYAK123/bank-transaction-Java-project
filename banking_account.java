import java.util.HashMap;
import java.util.Map;

class BankingAccount {
    private static final Map<Integer, Integer> accountBalances = new HashMap<>();

    public BankingAccount() {
        // Initialize account balances for users
        accountBalances.put(789456123, 10000);
        accountBalances.put(123456789, 5000);
    }

    public int getBalance(int acNumber) {
        Integer balance = accountBalances.get(acNumber);
        return balance != null ? balance : 0;
    }

    public void add(int acNumber, int amt) {
        int currentBalance = getBalance(acNumber);
        int updatedBalance = currentBalance + amt;
        accountBalances.put(acNumber, updatedBalance);
        System.out.println("Amount deposited successfully");
        System.out.println("Total Balance: " + updatedBalance);
        System.out.println();
    }

    public void withdraw(int acNumber, int amt) {
        int currentBalance = getBalance(acNumber);

        if (currentBalance < amt) {
            System.out.println("Invalid Withdrawal Amount");
        } else {
            int updatedBalance = currentBalance - amt;
            accountBalances.put(acNumber, updatedBalance);
            System.out.println("Please Collect your " + amt + " Rupees");
            System.out.println("Available Balance: " + updatedBalance);
            System.out.println();
        }
    }
}