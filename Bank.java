class BankAccount {
    // Encapsulation
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        if (balance >= 0) {
        this.balance = balance;
        }
    }
    // Getter method
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("Available balance : "+ balance);
            
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    //withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            System.out.println("Available balance after withdraw : "+ balance);
        } else {
            System.out.println("Invalid or insufficient funds");
        }
    }
}
    //MAin class
 public class Bank {
    public static void main(String[] args) {
        // object for class BankAccount
        BankAccount account = new BankAccount("Alice", 500.0);
        
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(200.0);
        account.withdraw(100.0);

        System.out.println("Updated Balance: $" + account.getBalance());
    }
}
