package week5._088_Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Student> list = new ArrayList<Student>();
    	
    	while (true) {
    		
    		System.out.print("Name: ");
    		String name = sc.nextLine();
    		
    			if (name.equals("")) {
    				break;
    			} else {
    				System.out.print("Student number: ");
    				String number = sc.nextLine();
    				list.add(new Student(name, number));
    			}
    	}
    	
    	printList(list);
    	
    	search(list);
    }
    
    public static void printList(ArrayList<Student> list) {
    	
    	System.out.println("");
     	for (Student each:list) {
    		System.out.println(each);
    	}
    }
    
    public static void search(ArrayList<Student> list) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("");
    	System.out.print("Give search term: ");
    	String term = sc.nextLine();
    	System.out.println("");
    	
    	for (Student each: list) {
    		if (each.getName().contains(term)){
    			System.out.println(each);
    		}
    	}
    }
}
  