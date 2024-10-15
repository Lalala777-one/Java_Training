package homework_24.task1.task2;

public class BankAccount implements PaymentSystem {

    private int account_number;
    private String account_holder;
    private double balance;
    private final String currency;

    public BankAccount(int account_number, String account_holder, String currency) {
        this.account_number = account_number;
        this.account_holder = account_holder;
        this.balance = 0.0;
        this.currency = currency;
    }

    public String toString(){
        return String.format("Account number: %d Owner: %s Current account balance in %s: %.2f\n", account_number,
                account_holder, currency, balance);
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if(balance >= amount){
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + ". New balance: " + balance);
        }else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Successfully deposited " + amount + ". New balance: " + balance);
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }
}
