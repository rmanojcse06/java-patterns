package edu.ds.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort extends Sort {

	@Override
	public Sort sort() {
		int c = 0;
		int n = this.arr.length;
        for (int i = 1; i < n; ++i) {
            int key = this.arr[i];
            int j = i - 1;
 
            while (j >= 0 && this.arr[j] > key) {
            	System.out.println(this.getClass().getSimpleName()+" :: "+(++c)+" => "+Arrays.toString(this.arr));
            	this.arr[j + 1] = this.arr[j];
                j = j - 1;
            }
            this.arr[j + 1] = key;
        }
		return this;
	}

}
