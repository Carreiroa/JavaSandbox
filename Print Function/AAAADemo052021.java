/*********************************************
@Author: A. Carreiro    @Date: Today
@Src File: AAAADemo052021.java
@Teacher: A. Carreiro

@Description: This program can do many things
but it won't bring you coffee.
***********************************************/


class AAAADemo052021 {  // The class name will be AAAADemo051820
     public static void main (String [] args){ // start main()
     
     /* ----- print
     It prints what is is the quotation marks and the cursor remains on the 
     same line after the last character it has printed.
    */
     
     //System.out.print("Hello"); //Hello_
     
     /* ----- println
     It prints what is is the quotation marks and the cursor is moved to the beginning
     of the next line.
     */
     
     //System.out.println("There"); //There
                                  //_
                                  
                                  /* -- Example Output --
                                  HelloThere
                                  _
                                  */
      /* -----printf
      This print function (printf) accepts special characters as a specifier
      for other values.
      
      %s <--- String types
      %d <--- int types
      %f <--- double types
      For all of the above tags you can add modifiers that alter the formatting of the value.
      These modifiers are placed between the % and the character that identifies the type.
      You may use two modifiers that are delimited by a period (this is not a decimal place, it is a delimiter).
      
      \t <--- tab space (5 spaces in in most IDEs)
      \n <--- new line marker
      
      
      */
      
      int num = 42;
      double num2 = 73.50;
      String word = "Andrew Carreiro";
      

      
      // ---- printf percision and specifiers
                  

      //System.out.printf ("%d\n%f" , num, num2);
      //System.out.printf ("My name is %s and I am\n%d years old. I make\n%f dollars per hour.", word,num,num2);
      
      //System.out.printf ( "%.2f",78.599);  // % column spacing . percision f
      
      //System.out.printf ( "%.2d",899);  // percision formatting will not work with %d
      //System.out.printf ( "%.6s", word);  // percision formatting with a string displays a specific number of characters

        
      // ----- printf column spacing with specifiers  
      int age = 42;
      double wage = 73.50;
      String fName = "Andrew";
      String lName = "Carreiro";
      
      //--- Recall ---- 
      //% column spacing . percision f
      //java automatically justifies the column as right.
      //To justify left place a - infront of the column spacing.
      
      //System.out.println ("123456789012345678901234567890123456789012345678901234567");
      
      
      System.out.printf ("%-20s%-18s%-8s%-11s\n","First Name", "Last Name","Age","Hourly Wage");
      System.out.println("=========================================================");
      System.out.printf ("%-20s%-18s%-8d%-11.2f\n",fName,lName,age,wage);
      System.out.printf ("%-20.20s%-18.18s%-8d%-11.2f\n","Christa","Fernando",15,80.56);
      System.out.printf ("%-20.20s%-18.18s%-8d%-11.2f\n","Maria","Carreiro-Ferreria de Luis",15,80.56);


          

      /* 
       20                  18               8        11
      123456789012345678901234567890123456789012345678901234567
      First Name          Last Name         Age     Hourly Wage
      
      Product Number       Name          Cost    Quantity
          
      */
          
   } // end main()
} // end class AAAADemo052021

