/*3/2/2018
**Jonathon Vega
**MIS302 HW5
**Program that flips and coin 100 times and tracks and prints how many times it lands on
**heads and tails.
*/

import java.util.Random;

class TossCoinWhile {
   public static void main(String[] args) {
      Random randomNum = new Random();
      
      int tosses =0;
      int faces = 0;
      int tails = 0;
      
      while(tosses != 100) {
         int toss = randomNum.nextInt(2);
         if (toss == 0) {
            tosses++;
            faces++;
         } else {
            tosses++;
            tails++;
         }
      }
      System.out.printf("The ratio of faces : tails of a 100-time coin tossing is %d : %d", faces, tails);
   }
   
}
