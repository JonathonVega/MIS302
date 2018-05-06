/*4/11/2018
**Jonathon Vega
**MIS302 HW7
**This is a temperature convertor program that reads a Celsius degree from
**user and converts it to Fahrenheit and vice versa.
*/

public class TempConvertTable {

   public static void main(String[] args) {
      
      // print the heading line
      System.out.println("Celcius\t\tFahrenheit\t|\tFahrenheit\t\t  Celcius");
      // print the separator
      System.out.println("------------------------------------------");
      // print the contents, loop, call feetToMeters() and metersToFeet()
      for(double fahrenheit = 30.0, celcius = 31.0; fahrenheit <= 120; fahrenheit+=10, celcius++) {
         System.out.printf("%4.1f\t\t%4.1f\t|\t%4.1f\t\t%4.1f\n", celcius, celciusToFahrenheit(celcius), fahrenheit, fahrenheitToCelcius(fahrenheit));
      }
   }
   
   // Method for converting Celcius to Fahrenheit
   public static double celciusToFahrenheit(double celcius){
      return (9.0 / 5) * celcius + 32;
   }
   
   // Method for converting Fahrenheit to Celcius
   public static double fahrenheitToCelcius(double fahrenheit) {
      return (5.0 / 9) * (fahrenheit - 32);
   }

}