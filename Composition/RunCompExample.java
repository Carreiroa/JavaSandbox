import java.util.ArrayList;

class RunCompExample {
   public static void main (String [] args){
   
      Contact [] myContacts = new Contact [4];
      PhoneBook myPhoneBook;
      
      myContacts[0] = new Contact ("Andy","Carreiro","905-555-1234");
      myContacts[1] = new Contact ("Julie","Carreiro","905-555-1234");
      myContacts[2] = new Contact ("Gabe","Carreiro","905-555-1234");
      myContacts[3] = new Contact ("Elizabeth","Carreiro","905-555-1234");
      
      myPhoneBook = new PhoneBook(myContacts);
      myPhoneBook.displayContacts();
   }
}

class Contact {
   String  fName;
   String lName;
   String phNum;

   Contact (String f, String l, String p) {
      fName = f;
      lName =l;
      phNum=p;
   }	
}

class PhoneBook {

   ArrayList <Contact> contacts = new ArrayList<>();

   PhoneBook (Contact [] contacts) {
   
      for (Contact contact : contacts ) {
      
         this.contacts.add(contact);
      
      }
   }

   void displayContacts (){
   
      if (contacts.get(0) != null) {
      
         System.out.println("---------------- Contacts ----------------");
         System.out.printf ("\n%-15s%-15s%-15s\n\n","First Name","Last Name","Phone Number");
         
         for (Contact contact: this.contacts){
            System.out.printf ("%-15s%-15s%-15s\n",contact.fName,contact.lName,contact.phNum);
         }
         
      }else{
         System.out.print("You don't have any contacts in your address book.");
      }
   }



}
