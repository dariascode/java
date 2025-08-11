public class Incapsulation {
    static class BankAccount {
        private int balance;


        void deposit(int amount) {
            if (amount > 0) {
               balance +=  amount;
            } else {
                balance -= amount;
            }
        }

        void withdraw(int amount) {
            if (balance >= amount && amount > 0) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }

        void print() {
            System.out.println("Balance: " + balance);
        }

    }


}

 class Main1 {
    public static void main(String[] args) {
        Incapsulation.BankAccount bankAccount = new Incapsulation.BankAccount();
        bankAccount.deposit(100);
        bankAccount.deposit(400);
        bankAccount.withdraw(600);
        bankAccount.print();
    }
}
