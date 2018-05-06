/*2/6/2018
**Jonathon Vega
**MIS302 HW2
**This is a temperature convertor program that reads a Celsius degree from
**user and converts it to Fahrenheit
*/

import java.util.Scanner;

public class TempConvertor {
   public static void main(String[] args) {
      //Create Scanner to obtain inputs
      Scanner input = new Scanner(System.in);
      
      double celcius;
      double fahrenheit;
      
      //Gathers celcius input from user
      System.out.print("Enter a degree in Celsius: ");
      celcius = input.nextDouble();
      
      //Formula for converting Celcius to Fahrenheit
      fahrenheit = (9.0 / 5) * celcius + 32;
      
      //Displays results of the conversion
      System.out.printf("%.1f Celcius is %.1f Fahrenheit", celcius, fahrenheit);
   }
}