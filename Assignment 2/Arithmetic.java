/*2/6/2018
**Jonathon Vega
**MIS302 HW2
**This is an arithmetic program to calculate sum, average, product,
**smallest, and largest of three user-input integers.
*/

import java.util.Scanner;

public class Arithmetic {
   public static void main(String[] args) {
      //Create Scanner to obtain inputs
      Scanner input = new Scanner(System.in);
      
      int number1;
      int number2;
      int number3;
      
      int sum;
      int average;
      int product;
      int maximal;
      int minimal;
      
      //Gathers three number inputs from user
      System.out.print("Enter the first integer: ");
      number1 = input.nextInt();
      
      System.out.print("Enter the second integer: ");
      number2 = input.nextInt();
      
      System.out.print("Enter the third integer: ");
      number3 = input.nextInt();
      
      sum = number1 + number2 + number3; //Add numbers, then store total in sum
      average = (number1 + number2 + number3)/ 3; //Average numbers, then store average total in average
      product = number1 * number2 * number3; //Multiply numbers, then store total in product
      
      if(number1 < number2) {//Check if number1 is smaller than number2
         minimal = number1;
         maximal = number2;
         if(number1 < number3) {//Check if number1 is smaller than number3
            //Nothing changes since number 1 is still the smallest
            if(number2 < number3) {//Check if number2 is smaller than 3
               maximal = number3; // number3 becomes the largest
            }
         } else {
            minimal = number3;
         }
      } else {
         minimal = number2;
         maximal = number1;
         if(number2 < number3) {//Check if number2 is smaller than number3
            //Nothing changes since number2 is still the smallest
            if(number1 < number3) {//Check if number1 is smaller than number3
               maximal = number3;
            }
         } else {
            minimal = number3;
         }
      }
      
      //Display results of sum, average, product, minimal, and maximal
      System.out.printf("Sum is %d\n", sum);
      System.out.printf("Average is %d\n", average);
      System.out.printf("Product is %d\n", product);
      System.out.printf("Minimal is %d\n", minimal);
      System.out.printf("Maximal is %d\n", maximal);
      
   }
}