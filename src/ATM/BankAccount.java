package ATM;

public class BankAccount {
    private float balance;
    private String pin;

    public BankAccount(String pin) {
        this.pin = pin;
    }

    public BankAccount(String pin, float balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public void withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }
    public void deposit(float amount) {
        balance += amount;
    }

    public float getBalance() {
        return balance;
    }

    public boolean validatePin(String pin) {
        return pin.equals(this.pin);
    }
}
