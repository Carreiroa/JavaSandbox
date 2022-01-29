class PrintfAttendanceSolution {
   public static void main(String[] args){
   
   //-- Variable Declaration & Initialization --
      String date = "Date: 11/19/2020";
      String firstName1 = "Andrew";
      String lastName1 = "Carreiro";
      String number1 = "0123456789";
      String firstName2 = "Sebastian";
      String lastName2 = "Patrizio-Corbasson";  
      String number2 = "9876543210";
      String plus = "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
      String present = "P";
      String late = "L"; 
      String absent = "A";   
      
      //-- Output --
      
      //System.out.printf("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890\n");
      System.out.printf("%90s\n",date);      
      System.out.printf("Class Attendance\n");
      System.out.printf("%s\n",plus);
      System.out.printf("%-24s%-24s%-23s%-4s%-4s%-4s%-4s%s\n","First Name","Last Name","Student #","Mon","Tue","Wed","Thu","Fri");
      System.out.printf("%s\n",plus);
      System.out.printf("%-24s%-24s%-24s%-4s%-4s%-4s%-4s%s\n",firstName1,lastName1,number1,present,present,present,absent,present);   
      System.out.printf("%-24s%-24s%-24s%-4s%-4s%-4s%-4s%s\n",firstName2,lastName2,number2,absent,present,late,absent,absent);
      System.out.printf("%s\n",plus);
      System.out.printf("%-72s%-4d%-4d%-4.1f%-4d%d","Total",1,0,.5,2,1);
   }// end main() method
}//end PrintfAttendanceSolution
