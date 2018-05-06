/*5/2/2018
**Jonathon Vega
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
               //calculateTotalSale();
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
   
   public void calculateTotalSale(){
   
   }
   
   
 }
