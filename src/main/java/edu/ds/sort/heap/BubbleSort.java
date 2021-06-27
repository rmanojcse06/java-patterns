package edu.ds.sort.heap;

import java.util.Arrays;
/**
 * @author rmanojcse06@gmail.com
 * <pre>
 * for i in range(len(arr) - 1):
 * 	for j in range(len(arr) - (i+1)):
 * 		if arr[j] > arr[j+1]:
 * 			arr[j+1],arr[j] = arr[j],arr[j+1] 
 * </pre> 
 */
public class BubbleSort extends Sort {

	@Override
	public Sort sort() {
		if(null != this.arr) {
			int c=0;
			for(int i=0; i< this.arr.length - 1; i++) {
				for(int j=0; j< this.arr.length - i - 1; j++) { 
					if(this.arr[j] > this.arr[j+1]){
						System.out.println(this.getClass().getSimpleName()+" :: "+(++c)+" => "+Arrays.toString(this.arr));
						int t = this.arr[j];
						this.arr[j] = this.arr[j+1];
						this.arr[j+1] = t;
					}				
				}
			}
		}
		return this;
	}

}
