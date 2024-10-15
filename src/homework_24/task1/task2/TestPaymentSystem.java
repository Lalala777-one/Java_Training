package homework_24.task1.task2;

public class TestPaymentSystem {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1, "Tom Krus", "USD");
        bankAccount.checkBalance();
        bankAccount.depositTransfer(1000);
        bankAccount.withdrawMoney(500);

        System.out.println("=================");
        System.out.println(bankAccount.toString());


        PaymentSystem electronicWallet = new ElectronicWallet(12, "Enny Tomson", "EUR");
        electronicWallet.checkBalance();
        electronicWallet.depositTransfer(250);
        electronicWallet.withdrawMoney(260);

        System.out.println("========================");
        System.out.println(electronicWallet.toString());;



    }
}
