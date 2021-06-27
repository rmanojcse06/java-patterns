package edu.ds.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort extends Sort {
	@Override
	public Sort sort() {
		if(null != this.arr) {
			int c=0;
			for(int i=0; i< this.arr.length; i++) {
				int minNdx = i; 
				for(int j=i+1; j< this.arr.length; j++) {
					if(this.arr[j] < this.arr[minNdx]) {
						System.out.println(this.getClass().getSimpleName()+" :: "+(++c)+" => "+Arrays.toString(this.arr));
						minNdx = j;
					}
				}
				
				int t = this.arr[minNdx];
				this.arr[minNdx] = this.arr[i];
				this.arr[i] = t;
			}
		}
		return this;
	}
}
