package week6._101_TheLibraryInformationSystem;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> lib;
	
	public Library() {
		this.lib = new ArrayList<Book>();
	}
	
	public void addBook(Book newBook) {
		lib.add(newBook);
	}
	
	public void printBooks() {
		for (Book each:lib) {
			System.out.println(each);
		}
	}
	
	public ArrayList<Book> searchByTitle(String title) {
		ArrayList<Book> found = new ArrayList<Book>();
		for (Book each:lib) {
			if (StringUtils.included(each.title(), title)){
				found.add(each);
			}
		}
		return found;
	}
	
	public ArrayList<Book> searchByPublisher(String publisher) {
		ArrayList<Book> found = new ArrayList<Book>();
		for (Book each:lib) {
			if (StringUtils.included(each.publisher(), publisher)){
				found.add(each);
			}
		}
		return found;
	}
	
	public ArrayList<Book> searchByYear(int year) {
		ArrayList<Book> found = new ArrayList<Book>();
		for (Book each:lib) {
			if (each.year() == year){
				found.add(each);
			}
		}
		return found;
	}
	
	
}
