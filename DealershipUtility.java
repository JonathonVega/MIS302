/*5/2/2018
**Jonathon Vega, Phat Le, Alexander Battle, Hailey Quigley
**MIS302 Final Project
**
*/

import java.util.Scanner;

public class DealershipUtility {
   
   public static void main(String[] args){
      Scanner processInput = new Scanner(System.in);
      int userProcessChoice;
      
      do {
         System.out.println("What would you like to do?");
         System.out.println("1 - Order Summary\n2 - Salesmen Standing\n3 - Dealership Revenue\n4 - End Program");
         userProcessChoice = processInput.nextInt();
      
         switch (userProcessChoice) {
            case 1:
               break;
            case 2:
               break;
            case 3:
               calculateTotalSale();
               break;
            case 4:
               System.out.println("Exiting system");
               break;
            default:
               System.out.println("Not a valid choice!");
         }
      }while(userProcessChoice != 4);
      
   }
   
   // Methods under here
   
   public int autoPricecalc() {
      return 1;
   }
   
   public void loanCalc(int autoPrice) {
   
   }
   // Process Two: Salesmen Standing
   public void salesmanStanding(){
      Scanner input = new Scanner(System.in);
      Scanner salesmanSales = new Scanner(System.in);
      
      
     
      
      //input how many sales they entering
      System.out.println("How many salesmen are there?");
      int totalsalesmen = input.nextInt();
       
      //array
      Salesman[] salesmenArray = new Salesman [totalsalesmen];
      
      //compares salesman totals
      for(int i = 0; i < totalsalesmen; i++){
         System.out.println("Please enter the amount of sales for Salesmen" + (i+1) + ":");
         double sale = salesmanSales.nextDouble();
         String salesmanName = "salesman" + (i+1);
         salesmenArray[i] = new Salesman(sale, salesmanName);   
      }
      
      Salesman bestSalesman = getBestSalesman(salesmenArray);
      
      System.out.println("The best salesman for the month is " + bestSalesman.name + " leading with " +bestSalesman.sales);
    
    }
   
    public static Salesman getBestSalesman(Salesman [] salesmenArray){
         Salesman bestSalesman = new Salesman(0, "emptySalesman");
         double maxSale = 0;
         for(Salesman salesman : salesmenArray){
           if(salesman.sales > maxSale){
             bestSalesman = salesman;
             maxSale = salesman.sales;
          
           }
         }
         return bestSalesman;    
      }

   
   // Third Process
   public static void calculateTotalSale(){
      Scanner input = new Scanner(System.in);
      double totalSale = 0;
      double saleAmount = 0;
      System.out.print("Type -1 to end process.\nInput the first sale amount:");
      while ( saleAmount != -1 ) {
         
         saleAmount = input.nextDouble();
         if(saleAmount == -1) {
            break;
         } else {
            totalSale += saleAmount;
         }
         System.out.print("Type -1 to end!\nInput the next sale amount:");
      }
      System.out.println("Total Amount is $" + totalSale + "!\n");   
   }
   
   
 }
