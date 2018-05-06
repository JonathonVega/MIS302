/*4/11/2018
**Jonathon Vega
**MIS302 HW7
// This program calculate sum, average, product, min and max of three user input integer.
*/

// program uses class Scanner
import java.util.Scanner; 

public class ArithmeticTest 
{
   // main method begins execution of Java application
   public static void main( String[] args )
   {
      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner( System.in );                  
      
      //invite users to input three integers
      System.out.print( "Enter first integer: " ); // prompt; when execute, the program will pause for user input   
      int number1 = input.nextInt(); // read first number from user

      System.out.print( "Enter second integer: " ); // prompt; when execute, the program will pause for user input 
      int number2 = input.nextInt(); // read second number from user
      
      System.out.print( "Enter third integer: " ); // prompt; when execute, the program will pause for user input 
      int number3 = input.nextInt(); // read third number from user

      int sum = sum(number1, number2, number3);
      double average = average(number1, number2, number3);//(number1 + number2 + number3) / 3.0;
      int product = product(number1, number2, number3);
      
      int min = min(number1, number2, number3);
      int max = max(number1, number2, number3);
      
      System.out.printf( "Sum of %d, %d and %d is %d\n", number1, number2, number3, sum); // display sum
      System.out.printf( "Average of %d, %d and %d is %f\n", number1, number2, number3, average); // display sum
      System.out.printf( "Product of %d, %d and %d is %d\n", number1, number2, number3, product); // display sum
      System.out.printf( "Max of %d, %d and %d is %d\n", number1, number2, number3, max);
      System.out.printf( "Min of %d, %d and %d is %d\n", number1, number2, number3, min);
   } // end method main
   
   // Sum Method
   public static int sum(int num1, int num2, int num3){
      return num1 + num2 + num3;
   }
   
   // Average method
   public static double average(int num1, int num2, int num3){
      return((num1 + num2 + num3)/3.0);
   }
   
   // Product Method
   public static int product(int num1, int num2, int num3){
      return num1 * num2 * num3;
   }
   
   // Max method
   public static int max(int num1, int num2, int num3){
      int max = num1;
      
      if (num2 > max)
         max = num2;

      if (num3 > max)
         max = num3;
         
      return max;
   }
   
   // Min method
   public static int min(int num1, int num2, int num3){
      int min = num1;
      
      if (num2 < min)
         min = num2;
         
      if (num3 < min)
         min = num3;
      
      return min;
   }
}