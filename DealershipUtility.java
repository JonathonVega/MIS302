/*5/9/2018
**Jonathon Vega, Phat Le, Alexander Battle, Hailey Quigley
**MIS302 Final Project
**This is a program that will help in creating order summaries while keeping up with salesman standings and sales as well as the
**total sales of the dealership
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class DealershipUtility {

   static Salesman[] salesmenArray;
   
   public static void main(String[] args){
      Scanner processInput = new Scanner(System.in);
      int userProcessChoice;
      
      do {
         System.out.println("What would you like to do?");
         System.out.println("1 - Order Summary\n2 - Salesmen Standing\n3 - Dealership Revenue\n4 - Loan Calculator\n5 - End Program\n");
         userProcessChoice = processInput.nextInt();
      
         switch (userProcessChoice) {
            case 1:
               autoPriceCalc();
               break;
            case 2:
               salesmanStanding();
               break;
            case 3:
               calculateTotalSale();
               break;
            case 4:
               loanCalc();
            case 5:
               System.out.println("Exiting system");
               break;
            default:
               System.out.println("Not a valid choice!");
         }
      }while(userProcessChoice != 5);
      
   }
   
   // Process one
   public static int autoPriceCalc(){
   
      String[] makes={"Hyundai", "Chevrolet", "Ford", "Toyota", "Volkswagon"};
      int[] makeIndex={10000, 14000, 15000,16000,20000};
      
      String[] models={"Compact Sedan", "Full-size Sedan", "Sportscar", "Midsize SUV", "Full-size SUV", "Truck"};
      int[] modelIndex={0, 4500, 8750, 6250, 8500, 25000};
      
      String[] trim ={"Standard", "Special Edition", "Sport", "Luxury"};
      int[] trimIndex={0, 1000, 2200, 3500};
      
      String[] colors= {"Black", "Silver", "Green", "White", "Blue", "Red"};
      int[] paintIndex={0,0,0,0,250,500};
      
      Scanner input=new Scanner(System.in);
      
      int makeChoice;
      int modelChoice;
      int trimChoice;
      int colorChoice;
      
      //Make Selection Process
      do{
         System.out.println("Enter the number associated with your choice in vehicle make");
         System.out.println("0) Hyundai |1) Chevrolet |2) Ford |3) Toyota |4) Volkswagon");
         try{
            makeChoice=input.nextInt();
         }catch(InputMismatchException e){
            makeChoice=-1;
            input.next();
            }
         if(makeChoice>=makeIndex.length||makeChoice<0){
            System.out.println("Incorrect input please try again");
            }
      }while(makeChoice>=makeIndex.length||makeChoice<0);
      
      //Model Selection Process
      do{
         System.out.println("Enter the number associated with your choice in model type");
         System.out.println("0) Compact Sedan |1) Full-size Sedan |2) Sportscar |3) Midsize Suv |4) Full-size SUV |5) Truck");
         try{
         modelChoice=input.nextInt();
         }catch(InputMismatchException e){
         modelChoice=-1;
         input.next();
         }
         if(modelChoice>=modelIndex.length){
            System.out.println("Incorrect input, please try again");
            }
      }while(modelChoice>=modelIndex.length||modelChoice<0);
      
      //Trim Selection Process
      do{
         System.out.println("Enter the number associated with your choice in trim type");
         System.out.println("0) Standard |1) Special Edition |2) Sport |3) Luxury");
         try{
         trimChoice=input.nextInt();
         }catch(InputMismatchException e){
         trimChoice=-1;
         input.next();
         }
         if(trimChoice>=trimIndex.length){
            System.out.println("Incorrect input please try again");
            }
      }while(trimChoice>=trimIndex.length||trimChoice<0);
      
      //Color Selection Process
      do{
         System.out.println("Enter the number associated with your choice in vehicle color");
         System.out.println("0) Black |1) Silver |2) Green |3) White |4) Blue |5) Red");
         try{
         colorChoice=input.nextInt();
         }catch(InputMismatchException e){
         colorChoice=-1;
         input.next();}
         if(colorChoice>=paintIndex.length){
            System.out.println("Incorrect input please try again");
            }
      }while(colorChoice>=paintIndex.length||colorChoice<0);
      
      //Print out Customer Selection and estimated price before tax
      int finalEstimate = (makeIndex[makeChoice]+modelIndex[modelChoice]+trimIndex[trimChoice]+paintIndex[colorChoice]);
      System.out.println("Car Summary and Cost Estimation:\n");
      System.out.printf("Make: %15s\n", makes[makeChoice]);
      System.out.printf("Model: %14s\n", models[modelChoice]);
      System.out.printf("Trim: %15s\n", trim[trimChoice]);
      System.out.printf("Color: %14s\n", colors[colorChoice]);
      System.out.printf("\n(Pre-tax)Price:$%14d\n",finalEstimate);
      System.out.println("");
      
      return finalEstimate;
   }
   
   public static void loanCalc() {
      Scanner input = new Scanner(System.in);
  
      System.out.print("Enter price quotes (ex: $5000) :$");
      double priceQuotes = input.nextDouble();
      double taxRate = .06;
      double afterTaxPrice = priceQuotes + ( priceQuotes * .06 ); 
      System.out.print("Enter the down payment :$");
      double downPayment = input.nextDouble();
      double loanAmount = afterTaxPrice - downPayment;
      double periodRate;
      int totalNumberOfPayments=1;
      if(loanAmount>0){
         System.out.print("Enter APR %");
         double aPR = input.nextDouble();
         periodRate = (aPR / 100) / 12;
         System.out.print("Enter loan term in year ");
         int loanTerm = input.nextInt();
         totalNumberOfPayments = loanTerm * 12 ;
      }
      else{periodRate=0;}
      
      double periodPayment = loanAmount / discountFactor(periodRate,totalNumberOfPayments);
      System.out.println("Total amount due now is $" + downPayment);
      System.out.println("Monthly payment is $" + periodPayment);
      System.out.println("Loan amount is $" + loanAmount);
      System.out.println("Tax rate is %" + taxRate);

   
   }
   public static double discountFactor(double periodRate,int totalNumberOfPayments) {
      double discountFactor = (( Math.pow((1 + periodRate),totalNumberOfPayments) ) - 1) / (periodRate * Math.pow((1 + periodRate),totalNumberOfPayments));
      return discountFactor;
   }
   
   // Process Two: Salesmen Standing
   public static void salesmanStanding(){
      Scanner input = new Scanner(System.in);
      Scanner salesmanSales = new Scanner(System.in);
      
      //input how many sales they entering
      System.out.println("How many salesmen are there?");
      int totalsalesmen = input.nextInt();
       
      //array
      salesmenArray = new Salesman [totalsalesmen];
      
      //compares salesman totals
      for(int i = 0; i < totalsalesmen; i++){
         System.out.println("Please enter the amount of sales for Salesmen" + (i+1) + ":");
         double sale = salesmanSales.nextDouble();
         String salesmanName = "salesman" + (i+1);
         salesmenArray[i] = new Salesman(sale, salesmanName);   
      }
      
      Salesman bestSalesman = getBestSalesman(salesmenArray);
      
      System.out.println("The best salesman for the month is " + bestSalesman.name + " leading with " +bestSalesman.sales + "\n");
    
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
      if(salesmenArray != null) {
         double totalSale = 0;
         for(Salesman salesman: salesmenArray){
            totalSale += salesman.sales;
         }
         System.out.println("Total Amount is $" + totalSale + "!\n");
      }else {
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
 }
