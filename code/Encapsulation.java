// Encapsulation example
public class BankAccount {
    // Private variables (attributes)
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }

    // Main method to test encapsulation
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("Alice", 1000.0);

        // Access and modify data through methods
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit and withdraw money
        account.deposit(500.0);
        account.withdraw(300.0);

        // Display updated balance
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
