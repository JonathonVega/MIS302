/*4/21/2018
**Jonathon Vega
**MIS302 HW9
**A class of an account object where a user can store money to
**to a checking and saving balance as well as perform various actions
**for them.
*/

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Accounts {
   double checkingBalance;
   double savingBalance;
   
   public Accounts() {
      checkingBalance = 200;
      savingBalance = 200;
   }
   
   public void depositToChecking(double amount) {
      checkingBalance =+ amount;
      printReceipt();
   }
   
   public void depositToSaving(double amount) {
      savingBalance =+ amount;
      printReceipt();
   }
   
   public void withdrawFromChecking(double amount) {
      checkingBalance =- amount;
      printReceipt();
   }
   
   public void withdrawFromSaving(double amount) {
      savingBalance =- amount;
      printReceipt();
   }
   
   public void transferToSaving(double amount) {
      checkingBalance =- amount;
      savingBalance =+ amount;
      printReceipt();
   }
   
   public void transferToChecking(double amount) {
      checkingBalance =+ amount;
      savingBalance =- amount;
   }
   
   public void getCheckingBalance() {
      System.out.println("Checking Balance: $"+ checkingBalance);
   }
   
   public void getSavingBalance() {
      System.out.println("Saving Balance: $" + savingBalance);
   }
   
   public void printReceipt() {
      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Date date = new Date();
      System.out.println(dateFormat.format(date));
      System.out.println("Transaction has been completed successfully!");
      getCheckingBalance();
      getSavingBalance();
   }
   
}