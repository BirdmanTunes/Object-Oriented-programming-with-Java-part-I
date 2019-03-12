package week6._104_Sorting;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] values = {6, 5, 8, 7, 11};
		System.out.println("smallest: " + smallest(values));
		
		// indexes:      0  1  2  3  4
		int[] values2 = {2, 5, 8, 3, 1};
		System.out.println("Index of the smallest: " + indexOfSmallest(values2));
		
		int[] values3 = {-1, 6, 9, 8, 12};
		System.out.println(indexOfTheSmallestStartingFrom(values3, 1));
		System.out.println(indexOfTheSmallestStartingFrom(values3, 2));
		System.out.println(indexOfTheSmallestStartingFrom(values3, 4));
		
		int[] values4 = {3, 2, 5, 4, 8};

		System.out.println( Arrays.toString(values4) );

		swap(values4, 1, 0);
		System.out.println( Arrays.toString(values4) );

		swap(values4, 0, 3);
		System.out.println( Arrays.toString(values4) );
		
		int[] values5 = {8, 3, 7, 9, 1, 2, 4};
		sort(values5);
	}
	
	public static void sort(int[] array) {
			for(int i = 0; i < array.length; i++) {
				printArray(array);
				swap(array,i,indexOfTheSmallestStartingFrom(array,i));
			}
	}
	
	public static void printArray(int[] array) {
		System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
        	System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
        System.out.println("");
	}
	  
	
	public static void swap(int[] array, int index1, int index2) {
	    int store = array[index1];
	    array[index1] = array[index2];
	    array[index2] = store;
	}
	
	public static int smallest(int[] array) {
	    int smallest = array [0];
	    	for (int i=1; i < array.length; i++) {
	    		if (array[i] < smallest) {
	    			smallest = array[i];
	    		}
	    	}
	    return smallest;
	}
	
	public static int indexOfSmallest(int[] array) {
	    int smallest = array [0];
	    int index = 0;
    	for (int i=1; i < array.length; i++) {
    		if (array[i] < smallest) {
    			smallest = array[i];
    			index = i;
    		}
    	}
    return index;
	}
	
	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
	    int smallest = array [index];
	    int indexStart = index;
    	for (int i=index; i < array.length; i++) {
    		if (array[i] < smallest) {
    			smallest = array[i];
    			indexStart = i;
    		}
    	}
    return indexStart;
	}
}
