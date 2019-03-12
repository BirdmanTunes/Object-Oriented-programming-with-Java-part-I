package week6._106_BinarySearch;

public class BinarySearch {
	
	public static boolean search(int[] array, int searchedValue) {
		
        int lower = 0;
        int upper = array.length - 1;

        while (lower <= upper) {
            int average = (lower + upper) / 2;
            if (array[average] == searchedValue) {
                return true;
            }
            if (array[average] < searchedValue){
                lower = average + 1;
            }
            if (array[average] > searchedValue){
                upper = average - 1;
            }
        }
        return false;
	}
}
