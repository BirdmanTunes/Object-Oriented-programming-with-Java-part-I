package week2._040_PrintingLikeABoss;

public class PrintingLikeABoss {

	public static void main(String[] args) {

		xmasTree(10);

	}
	
	public static void xmasTree(int height) {
		
		int i = 0;
		int j = 0;
		
		while (i < height) {
			
			printWhiteSpaces((height - i) - 1);
			printStars(i * 2 + 1);
			i++;
		}
		
		while (j < 2) {
			
		printWhiteSpaces(height - 2);
		printStars(3);
		j++;
		}
	}
	
	public static void printTriangle(int size) {
		
		int i = 1;
		int j = size - 1;
		
		while (i <= size) {
			
			printWhiteSpaces(j);
			printStars(i);
			i++;
			i++;
			j--;
		}
	}
	
	public static void printStars(int size) {
		
		int i = 0;
		while (i < size) {
			System.out.print("*");
			i++;
		}
		System.out.println("");
	}
	
	public static void printWhiteSpaces(int size) {
		
		int i = 0;
		while (i < size) {
			System.out.print(" ");
			i++;
		}
	}

}
