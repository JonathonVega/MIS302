/*2/14/2018
**Jonathon Vega
**MIS302 HW4
**Program that calculates a given user input year and that year's Valentines Day
**to display the day Name of the next Valentines Day.
*/

import java.util.Scanner;

public class NextValentineDay{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int year;
      int day;
      int nextValentinesDay;
      int nextYear;
      
      System.out.print("Please enter the year(xxxx): ");
      year = input.nextInt();
      nextYear = year + 1;
      
      System.out.println("Please enter the day number of a week for the Valentine's Day in the year");
      System.out.print("(Sunday - 0, Monday - 1, Tuesday - 2, Wednesday - 3, Thursday - 4, Friday - 5, Saturday - 6): ");
      day = input.nextInt();
      
      boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
      
      if (isLeapYear) {
         nextValentinesDay = ((366%7) + day) % 7;
      } else {
         nextValentinesDay = ((365%7) + day) % 7;
      }
      
      switch(nextValentinesDay) {
         case 0: System.out.printf("The Valentine\'s day in %d will be on Sunday", nextYear);break;
         case 1: System.out.printf("The Valentine\'s day in %d will be on Monday", nextYear);break;
         case 2: System.out.printf("The Valentine\'s day in %d will be on Tuesday", nextYear);break;
         case 3: System.out.printf("The Valentine\'s day in %d will be on Wednesday", nextYear);break;
         case 4: System.out.printf("The Valentine\'s day in %d will be on Thursday", nextYear);break;
         case 5: System.out.printf("The Valentine\'s day in %d will be on Friday", nextYear);break;
         case 6: System.out.printf("The Valentine\'s day in %d will be on Saturday", nextYear);break;
      }
   }
}

/*
**If we were going to modify this program to find out the day of the week for next Christmas day,
**we would have to change when leap year should be accounted for. If the year falls on a leap year
**then we would not have to account for leap day since it would have already passed, therefore
**keeping the year count at 365. Otherwise, if the following year that the next Christmas day is on
**is a leap year, then we would take leap day into account, thus following a 366 calander year.
*/