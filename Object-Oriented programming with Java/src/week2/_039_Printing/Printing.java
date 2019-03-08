package week2._039_Printing;

public class Printing {

	public static void main(String[] args) {

	    printTriangle(4);
	    

	}
	
	public static void printStars(int number) {
		
		int i = 0;
		while (i < number) {
			System.out.print("*");
			i++;
		}
		System.out.println("");
	}
	
	public static void printSquare(int sideSize) {
		
		int i = 0;
		while (i < sideSize) {
			printStars(sideSize);
			i++;
		}
	}
	
	public static void printRectangle(int width, int height) {
		
		int i = 0;
		while (i < height) {
			printStars(width);
			i++;
		}
	}
	
	public static void printTriangle(int size) {
		
		int i = 1;
		while (i <= size) {
			printStars(i);
			i++;
		}
	}

}
