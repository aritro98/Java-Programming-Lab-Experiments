import java.util.Scanner;
class NegativeAmountException extends Exception {
    public NegativeAmountException(String s) {
        super(s);
    }
}
interface Amount {
    void deposit(int n) throws NegativeAmountException;
    void withdraw(int m) throws NegativeAmountException;
}
class Bank implements Amount {
    private int balance = 0;
    public void deposit(int n) throws NegativeAmountException {
        if (n < 0) {
            throw new NegativeAmountException("Deposit amount cannot be negative");
        }
        balance += n;
        System.out.println("Balance Remaining: " + balance);
    }
    public void withdraw(int m) throws NegativeAmountException {
        if (m < 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative");
        }
        if (balance >= m) {
            balance -= m;
            System.out.println("Balance Remaining: " + balance);
        }
        else {
            System.out.println("Insufficient balance.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println("Enter the amount:");
        int a = sc.nextInt();
        try {
            System.out.println("What would you like to do?\n1) Deposit\n2) Withdraw");
            System.out.println("Enter your choice:");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    bank.deposit(a);
                    break;
                case 2:
                    bank.withdraw(a);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        catch (NegativeAmountException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

