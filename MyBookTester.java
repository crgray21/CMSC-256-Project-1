public class MyBookTester {

	public static void main(String[] args) {

		printHeading();
		
		MyBook book1 = new MyBook();
		MyBook book2 = new MyBook("Moby Dick","Herman", "Melville", "1234567890","1234567890123");
		MyBook book3 = new MyBook("Eragon", "", "Paolini", "12345678901","123456789012");
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book2.getTitle()+ "\n" +book2.getAuthorFirstName()+"\n"+book2.getAuthorLastName()+"\n"+book2.getIsbn10()+"\n"+book2.getIsbn13()+"\n");
		
		book1.setTitle("The Great Divide");
		book1.setAuthorFirstName("Audrey");
		book1.setAuthorLastName("Langes");
		book1.setIsbn10("01234567890");
		book1.setIsbn13("01234567890123");		
		
		System.out.println(book1.toString());
		
		book1.setIsbn10("1234567890");
		book1.setIsbn13("1234567890123");
		System.out.println(book1.toString());
		
		book1.setIsbn10("1234abc890");
		System.out.println(book1.toString());
		
		if (book1.equals(book1) == true)
			System.out.println("\nbook1 is equal to itself.\n");
		else
			System.out.println("\nbook1 is not symmetric\n");
		
		if (book1.equals(book2) == true)
			System.out.println("\nbook1 ISBN is equal to book2 ISBN.\n");
		else
			System.out.println("\nThe two ISBN's are not the same.\n");
		
		if(book2.equals(book3) == true)
			System.out.println("book1 ISBN is equal to book2 ISBN.\n");
		else
			System.out.println("The two ISBN's are not the same.\n");
		
		if (book1.equals(book2) == true && book2.equals(book3) == true)
				System.out.println("book1 ISBN is equal to book3 ISBN.\n");
		else
			System.out.println("book1 and book3 ISBN's are not the same.\n");
			
		
		
	}
	
	public static void printHeading()
	{
		System.out.println("Cory Gray\nFall 2016 CMSC 256 Programming Project 1: Book\nThe purpose of this project is "
				+ "to create a program that models\nthe information that would be stored in a book object. Methods\nare used to "
				+ "modify, change, output, and validate information\nfrom various book objects. \n\n\n");
	}

}

