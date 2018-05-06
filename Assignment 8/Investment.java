/*4/18/2018
**Jonathon Vega
**MIS302 HW8
**A class that contains a method to calculate the future investment value
**and anothe method to print out a table of the future values up to 30 years.
*/

public class Investment {
   double investmentAmount, annualRate;
   
   public double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
      double futureValue;
      futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate/100, years *12);
      return futureValue;
   }
   
   public void printFutureValueTable() {
      System.out.println("Years\t\tFuture Value");
      for(int year = 1; year <= 30; year++) {
         double futureValue = futureInvestmentValue(investmentAmount, annualRate/12, year);
         System.out.printf("%d\t\t\t\t%5.2f\n",year, futureValue);
      }
   }
}