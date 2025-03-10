package Lesson_30_10032025.HW_2_10032025;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.checkBalance();
        bankAccount.withdrawMoney(30);
        bankAccount.depositTransfer(50);

        System.out.println("==================");

        ElectronicWallet electronicWallet = new ElectronicWallet(200);
        electronicWallet.checkBalance();
        electronicWallet.withdrawMoney(70);
        electronicWallet.depositTransfer(30);
    }
}
