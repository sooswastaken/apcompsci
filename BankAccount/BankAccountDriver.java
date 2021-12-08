public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount usersBankAccount = new BankAccount("Bob", 200);
        System.out.println(usersBankAccount);
        usersBankAccount.deposit(100);
        System.out.println(usersBankAccount);
        usersBankAccount.withdraw(123123123);
        System.out.println(usersBankAccount);
    }
}