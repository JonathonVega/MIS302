import java.util.Scanner;
import java.util.InputMismatchException;


public class AutoSales{

   public static void main(String[] args){
      autoPriceCalc();
      }

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
      
      return finalEstimate;
   }
}     




//Code by Alex Battle             