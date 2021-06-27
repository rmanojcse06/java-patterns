package edu.ds.algorithm.sorting;

import java.util.Arrays;

public abstract class Sort {
	int[] arr = null;
	public Sort input(int[] arr) {
		this.arr = arr;
		return this;
	}
	public Sort output() {
		Arrays.stream(arr, 0, arr.length)
			.forEach(i->System.out.print(i+", "));
		return this;
	}
	public abstract Sort sort();
}
