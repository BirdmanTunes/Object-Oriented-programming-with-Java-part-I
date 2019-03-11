package week6._102_GradeDistribution;

import java.util.ArrayList;

public class Grades {
	
	private ArrayList<Integer> grades;
	
	public Grades() {
		grades = new ArrayList<Integer>();
	}
	
	public void addGrade(int grade) {
		grades.add(grade);
	}
	
	public void distributionPrint() {
		
		int[] gradesArr = {0, 0, 0 ,0, 0};
		
		for (int each:grades) {
			if (each >= 0 && each < 30) {
				
			} else if (each > 29 && each < 35) {
				gradesArr[0] += 1;
			} else if (each > 34 && each < 40) {
				gradesArr[1] += 1;
			} else if (each > 39 && each < 45) {
				gradesArr[2] += 1;
			} else if (each > 44 && each < 50) {
				gradesArr[3] += 1;
			} else if (each > 49) {
				gradesArr[4] += 1;
			}
		}
		
        int accepted = 0;
        
        for (int each: gradesArr) {
        	accepted += each;
        }
		
		System.out.println("Grade distribution:");
		for (int i = 0; i < gradesArr.length; i++) {
			printStars(gradesArr.length - i, gradesArr[i]);
		}
		System.out.println("Acceptance percentage: " + (double)100 * accepted/grades.size());
	}
	
	public void printStars(int grade, int number) {
		System.out.print(grade + ": ");
		for (int i = 0; i < number; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}


