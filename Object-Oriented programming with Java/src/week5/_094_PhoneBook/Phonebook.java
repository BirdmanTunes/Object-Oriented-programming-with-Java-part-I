package week5._094_PhoneBook;

import java.util.ArrayList;

public class Phonebook {
	
	private ArrayList<Person> book;
	
	public Phonebook() {
		this.book = new ArrayList<Person>();
	}
	
	public void add(String name, String number) {
		Person newPerson = new Person(name, number);
		book.add(newPerson);
	}
	
	public void printAll() {
		for(Person each:book) {
			System.out.println(each);
		}
	}
	
	public String searchNumber(String name) {
		
		String test = "";
		for(Person each:book) {
			if (each.getName().contains(name))
				return each.getNumber();
		}
		return "Number not known.";
	}
}
