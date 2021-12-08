public class BankAccount {
   private String ownersName;
   private double balance;
   
   public BankAccount(String name, double bal) {
      ownersName = name;
      balance = bal;
   }

   public String getOwnersName() {
      return ownersName;
   }

   public double getBalance() {
      return balance;
   }

   public void deposit(double value) {
      balance += value;
   }

   public void withdraw(double value) {
      if((balance - value) >= 0) {
         balance -=value;
      }
   }

   public String toString() {
      return "Owner: " + ownersName + ". Balance: " + balance;
   }

}