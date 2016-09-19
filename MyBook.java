public class MyBook
{
	//initial variables
	private String title;
	private String authorFirstName;
	private String authorLastName;
	private String isbn10;
	private String isbn13;

//default constructor
MyBook ()
{
	title = "None given";
	authorFirstName = "None given";
	authorLastName = "None given";
	isbn10 = "0000000000";
	isbn13 = "0000000000000";
	
}

//constructor for MyBook Class
MyBook (String title, String authorFirstName, String authorLastName, String isbn10, String isbn13)
{
	if (title == null)
		this.title = "None given";
	else
		this.title = title;
	
	if(authorFirstName == null)
		this.authorFirstName = "None given";
	else
		this.authorFirstName = authorFirstName;
	
	if(authorLastName == null)
		this.authorLastName = "None given";
	else
		this.authorLastName = authorLastName;
	
	if(isbn10 == null)																//validating ISBN using if statements
		this.isbn10 = "0000000000";
	
	if (isbn10.length() != 10)
	{
		System.out.println("Non valid ISBN10...ISBN10 set to default value.");		
		this.isbn10 = "0000000000";
	}
	else
		this.isbn10 = isbn10;
	
	
	if(isbn13 == null)																//validating ISBN using if statements
		this.isbn13 = "0000000000000";
	if (isbn13.length() != 13)
	{
		System.out.println("Non valid ISBN13...ISBN13 set to default value.");
		this.isbn13 = "0000000000000";
	}
	else
		this.isbn13 = isbn13;
}

//mutator methods

public String getTitle ()
{
	return title;
}

public String getAuthorFirstName ()
{
	return authorFirstName;
}

public String getAuthorLastName ()
{
	return authorLastName;
}

public String getIsbn10 ()
{
	return isbn10;
}

public String getIsbn13 ()
{
	return isbn13;
}

public void setTitle(String title)
{
	this.title = title;
}

public void setAuthorFirstName(String firstName)
{
	authorFirstName = firstName;
}

public void setAuthorLastName(String lastName)
{
	authorLastName = lastName;
}

public void setIsbn10(String isbn10)
{
	if (containsOnlyNumbers(isbn10) == true && isbn10.length() == 10)	//validating that the ISBN's are the correct length and there are no characters in string
			this.isbn10 = isbn10;
	else
		System.out.println("Invalid ISBN10...current ISBN10 will remain.\n");
}

public void setIsbn13(String isbn13)
{
	if (containsOnlyNumbers(isbn13) == true && isbn13.length() == 13)	//validating that the ISBN's are the correct length and there are no characters in string
		this.isbn13 = isbn13;
	else
		System.out.print("Invalid ISBN13...current ISBN13 will remain.\n");
}

//toString method for printing out an object in a set format
@Override
public String toString()
{
	return "Book Title: " +title+ "\nAuthor Name: " +authorFirstName+ " " +authorLastName+ "\nISBN10: " +isbn10+ "\nISBN13: " +isbn13+ "\n";
}

//method to check if the ISBN's of two books are equal
@Override
public boolean equals(Object otherBook)
{
	if (otherBook instanceof MyBook)
		{
		return isbn10.equals(((MyBook)otherBook).isbn10) && isbn13.equals(((MyBook)otherBook).isbn13);
		}
	else
		return false;				
}

//boolean method that returns true if the object string contains only numbers and returns false if there is a character
public boolean containsOnlyNumbers(String digitCheck) {
    for (int i = 0; i < digitCheck.length(); i++) {
      if (!Character.isDigit(digitCheck.charAt(i)))
        return false;
    }
    return true;
  }
}
