package Lesson_30_10032025.HW_2_10032025;

// Perviy Metod:
//public class ElectronicWallet extends BankAccount{
//    public ElectronicWallet(double balance) {
//        super(balance);
//    }
//}

// Vtoroy Metod:
public class ElectronicWallet implements PaymentSystem{
    private double balance;

    public ElectronicWallet(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance){
            balance -= amount;
            System.out.println("Snyato: " + amount + " dollars. Ostatok: " + balance + " dollars.");
        } else {
            System.out.println("Nedostatochno sredstv v koshelke. Popolnite balance!");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Na vash koshelek postupilo: " + amount + " dollars. Balance: " + balance + " dollars.");

    }

    @Override
    public void checkBalance() {
        System.out.println("Vash balance: " + balance + " dollars.");

    }
}