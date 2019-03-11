package week6._102_GradeDistribution;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Grades list = new Grades();
	    
	    System.out.println("Type exam scores, -1 exits:");

	    while (true) {
	    	
	    	int grade = Integer.parseInt(sc.nextLine());
	    	
	    	if (grade < 0) {
	    		break;
	    	} else {
				list.addGrade(grade);
			}
	    }
	    list.distributionPrint();
	}
}
