public class Main {
    public static void main(String[] args) {
           Incapsulation incapsulation = new Incapsulation();
           Incapsulation.BankAccount bankAccount = new Incapsulation.BankAccount();
           bankAccount.deposit(100);
           bankAccount.deposit(200);
           bankAccount.withdraw(100);
           bankAccount.print();
    }
}