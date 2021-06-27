package edu.ds.algorithm.sorting;

public class SortMain {
	public static void main(String[] args) {
//		int[] arr = new int[] {2,12,4,15,11,13,5,1,6,8,14,7,3,10,9};
		int[] arr = new int[] {8, 5,3,4,2,6,9,1,7};
//		Sort selectionSort = new SelectionSort();
//		selectionSort.input(arr)
//						.sort()
//							.output();
		
//		Sort bubbleSort = new BubbleSort();
//		bubbleSort.input(arr)
//					.sort()
//						.output();
		
//		Sort insertionSort = new InsertionSort();
//		insertionSort.input(arr)
//						.sort()
//							.output();
		
		Sort quickSort = new QuickSort();
		quickSort.input(arr)
					.sort()
						.output();
		
		
	}
}
