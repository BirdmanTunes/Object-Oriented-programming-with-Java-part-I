package week5._088_Students;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private String number;
	
	public Student(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStudentNumber() {
		return number;
	}
	
	public String toString() {
		return name + " (" + number + ")";
	}

}
