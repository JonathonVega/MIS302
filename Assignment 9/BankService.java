/*4/21/2018
**Jonathon Vega
**MIS302 HW9
**A program that creates a bank account for a user and allow them
**to do various actions for their account and to print their
**reciept.
*/

import java.util.Scanner;

public class BankService {
   public static void main(String[] args) {
      Scanner userChoice = new Scanner(System.in);
      Scanner input = new Scanner(System.in);
      Accounts account = new Accounts();
      System.out.println("Welcome! Please select one of the options for your account.");
      System.out.println("1 - Deposit an amount to checking\n2 - Deposit an amount to saving\n3 - Withdraw an amount to checking\n4 - Withdraw an amount to saving\n5 - Transfer an amount from checking to saving\n6 - Transfer an amount from saving to checking");
      int choice = userChoice.nextInt();
      double amount;
      
      switch(choice) {
         case 1:
            System.out.println("How much would you like to deposit to checking?");
            amount = input.nextDouble();
            account.depositToChecking(amount);
            break;
         case 2:
            System.out.println("How much would you like to deposit to saving?");
            amount = input.nextDouble();
            account.depositToSaving(amount);
            break;
         case 3:
            System.out.println("How much would you like to withdraw from checking?");
            amount = input.nextDouble();
            account.withdrawFromChecking(amount);
            break;
         case 4:
            System.out.println("How much would you like to withdraw from saving?");
            amount = input.nextDouble();
            account.withdrawFromSaving(amount);
            break;
         case 5:
            System.out.println("How much would you like to transfer from checking to saving?");
            amount = input.nextDouble();
            account.transferToSaving(amount);
            break;
         case 6:
            System.out.println("How much would you like to transfer from saving to checking?");
            amount = input.nextDouble();
            account.transferToChecking(amount);
            break;
         default:
            account.getCheckingBalance();
            account.getSavingBalance();
      }
   }
}