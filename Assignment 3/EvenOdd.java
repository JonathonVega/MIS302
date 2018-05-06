/*2/9/2018
**Jonathon Vega
**MIS302 HW3
**This is a program that checks an integer input from
**the user and checks if it either even or odd.
*/

import java.util.Scanner;

public class EvenOdd {
   public static void main(String[] args) {
   
      //Create Scanner to obtain inputs
      Scanner input = new Scanner(System.in);
      
      int number;
      
      //Prompt user to type in an integer
      System.out.println("Please input your number: ");
      number = input.nextInt();
      
      //Check if user's number is either even or odd and print the result
      if((number % 2) == 0) {
         System.out.println("even");
      } else {
         System.out.println("odd");
      }
   
   }
}