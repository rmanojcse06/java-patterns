package edu.ds.algorithm.searching;

import java.util.stream.IntStream;

public class BinarySearch {
	int binarySearch(int[] arr, int low, int high, int find, int counter) {
		++counter;
		if(high > low) {
			int mid = (low + (high - low))/2;
			if(arr[mid] == find) {
				System.out.println("Match Found after "+counter+" iterations");
				return mid;
			}
			if(arr[mid] > find) {
				return binarySearch(arr, low, mid - 1, find, counter);
			}
			return binarySearch(arr, mid + 1, high, find, counter);
		}
		return -1;
	}
	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();
		int[] arr = IntStream.range(10, 123).toArray();
		System.out.println(search.binarySearch(arr, 0, arr.length-1, 12, 0));
	}
}
