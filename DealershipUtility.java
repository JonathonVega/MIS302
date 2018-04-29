/*5/2/2018
**Jonathon Vega
**MIS302 Final Project
**
*/

import java.util.Scanner;

public class DealershipUtility {
   
   public static void main(String[] args){
      
      Scanner processInput = new Scanner(System.in);
      System.out.println("What would you like to do?");
      System.out.println("1 - Order Summary\n2 - Salesmen Standing\n3 - Dealership Revenue");
      int userProcessChoice = processInput.nextInt();
      
      switch (userProcessChoice) {
         case 1:
            break;
         case 2:
            break;
         case 3:
            break;
         default:
            System.out.println("Not a valid choice!");
      }
      
      
   }
   
   // Methods under here
   
   public int autoPricecalc() {
      return 1;
   }
   
   public void loanCalc(int autoPrice) {
   
   }
   
   
 }
