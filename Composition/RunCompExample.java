class RunCompExample {
	public static void main (String [] args){
	
		Contact [] myContacts = new Contact [4];
		PhoneBook myPhoneBook =new PhoneBook(myContacts);

		myPhoneBook.display();
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

}
