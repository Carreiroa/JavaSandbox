/*Andrew Carreiro        Date: Nov. 19, 2020
 * WorkingWithPrintEx1
 * 
 * In this program we will use the print, println, and printf
 */

class WorkingWithPrintEx1{//open class
   public static void main (String[] args){//open main
    
    
      // prints to the screen and does not return a new line.
      System.out.print("The numbers below this"); 
      
      // prints where the cursor was last left and returns a new line.
      System.out.println(" line help to demonstrate the spacing with columns."); 
      
      /* Printf ---
       * %s -- string
       * %d -- int
       * %f -- double
       * /t -- tab (5 spaces in Dr. Java)
       * /n %n -- line return
       * % <-> justify left <#> specify column spacing <.#> specifiy precision for float  Ex. %-10.2f
       * 
       */
      
      System.out.println("1234567890123456789012345678901234567890");
      System.out.printf("%-10s%-5d%-5.1f","Andy",42,5.9); 
      
      
   }//close main
}// close class