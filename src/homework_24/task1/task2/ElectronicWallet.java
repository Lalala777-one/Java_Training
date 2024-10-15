package homework_24.task1.task2;

public class ElectronicWallet implements PaymentSystem{

    private int wallet_id;
    private String owner_name;
    private double balance = 0.0;
    private final String currency;


    public ElectronicWallet( int wallet_id, String owner_name, String currency) {
        this.currency = currency;
        this.wallet_id = wallet_id;
        this.owner_name = owner_name;
    }

    public String toString(){
        return String.format("Account number: %d Owner: %s Current account balance in %s: %.2f\n", wallet_id,
                owner_name, currency, balance);
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
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Successfully deposited " + amount + ". New balance: " + balance);

    }

    @Override
    public double checkBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }
}
