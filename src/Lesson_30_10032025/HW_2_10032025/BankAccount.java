package Lesson_30_10032025.HW_2_10032025;

public class BankAccount implements PaymentSystem{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Snyato: " + amount + " euro. Ostatok: " + balance + " euro.");
        } else {
            System.out.println("Nedostatochno sredstv na schete!");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Na vash schet postupilo " + amount + " euro. Balance: " + balance + " euro.");
    }

    @Override
    public void checkBalance() {
        System.out.println("Vash balance: " + balance + " euro.");
    }
}
