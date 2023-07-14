import java.util.Map;
import java.util.HashMap;

class MethodImplement implements Interface {

   Methods atm = new Methods();

   Map<Double, String> statement = new HashMap<>();

   @Override
   public void for_withdraw(double withdrawAmount) {
      if (withdrawAmount < atm.getBalance()) {
         statement.put(withdrawAmount, "Amount Withdrawn");

         System.out.println("Collect your Case " + withdrawAmount);
         double totalAmount = atm.getBalance() - withdrawAmount;
         atm.setBalance(totalAmount);
         for_viewBalance();
      } else {
         System.out.println("Insufficient Balance !!");
      }
   }

   @Override
   public void for_viewBalance() {
      System.out.println("Available Balance is : " + atm.getBalance());
   }

   @Override
   public void for_deposit(double depositAmount) {
      statement.put(depositAmount, "Amount Deposited");

      System.out.println(depositAmount + "Deposited Successfully!!");
      double totalAmount = atm.getBalance() + depositAmount;
      atm.setBalance(totalAmount);
      for_viewBalance();
   }

   @Override
   public void for_transactionHistory() {
      for (Map.Entry<Double, String> m : statement.entrySet()) {
         System.out.println(m.getKey() + ":" + m.getValue());
      }
   }

   @Override
   public void for_transfer(double transferAmount) {
      if (transferAmount < atm.getBalance()) {
         statement.put(transferAmount, "Amount Transfered");
         double totalAmount = atm.getBalance() - transferAmount;
         atm.setBalance(totalAmount);
      } else {
         System.out.println("Insufficient Balance !!");
      }
   }

}