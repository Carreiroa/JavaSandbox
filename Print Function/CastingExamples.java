import java.util.Scanner;
class CastingExamples {
   public static void main (String [] arg){
      Scanner userInput = new Scanner (System.in);
      System.out.println("Enter an integer number:");
      double num = userInput.nextInt();
      System.out.printf("The square of %.1f is %.1f",num,num*num);
   }
}