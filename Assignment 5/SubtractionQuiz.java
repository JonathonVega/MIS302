/*3/2/2018
**Jonathon Vega
**MIS302 HW5
**Program that creates a subtractions quiz using numbers 0-10 that invites the user to
**quiz themselves. It then prints the amount the user got correct and incorrect.
*/

import java.util.Scanner;
import java.util.Random;

class SubtractionQuiz {
   public static void main(String[] args) {
   
   // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Create a random generator
    Random randomNum = new Random();

    int count = 0;
    int correct = 0;
    int incorrect = 0;
    
    int largeNum;
    int smallNum;
    
    while (count < 10) {
      int number1 = (int)(Math.random() * 10);
      int number2 = (int)(Math.random() * 10);
       
       if(number1 > number2) {
         largeNum = number1;
         smallNum = number2;
      } else {
         largeNum = number2;
         smallNum = number1;
      }
   
       // Prompt the question 
       System.out.print("What is " + largeNum + " - " + smallNum + "? ");
       
       // Take user input answer
       int answer = input.nextInt();
   
       // Print the question, answer and quiz result.
       if (largeNum - smallNum == answer) {
         System.out.println("Correct!");
         correct++;
       }else {
         System.out.println("Incorrect!");
         incorrect++;
         }
       count++;
    }
    
    System.out.printf("You got %d correct and %d incorrect!", correct, incorrect);
   
   }
}