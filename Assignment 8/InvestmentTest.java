/*4/18/2018
**Jonathon Vega
**MIS302 HW8
**A program that takes user inputs and prints out a table
**of future values.
*/

import java.util.Scanner;

public class InvestmentTest {
   
   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      
      double investmentAmount, annualRate;
      int years;
      
      System.out.print("Enter investment amount, for example 100: ");
      investmentAmount = input.nextDouble();
      
      System.out.print("Enter yearly interest rate, for example 5.25: ");
      annualRate = input.nextDouble();
      
      /*System.out.print("Enter the amount of years, for example 4: ");
      years = input.nextInt();*/
      
      Investment investment = new Investment();
      investment.investmentAmount = investmentAmount;
      investment.annualRate = annualRate;
      
      investment.printFutureValueTable();
   }
}