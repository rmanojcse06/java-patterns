package edu.ds.sort.heap;

import java.util.Arrays;


/**
 * 
 * Algorithm: Quick Sort by Manoj Ravikumar
 * email: rmanojcse06@gmail.com
 * <pre>
 * 	qSort(arr, 0, len);
 * 
 * 
 * 		def qSort(arr, s, e):
 * 			if(s >= e):
 * 				return;
 * 			p = partition(arr, s, e);
 * 			qSort(arr, s, p-1);
 * 			qSort(arr, p+1, e);
 * 
 * 		def partition(arr, s, e):
 * 			cp = s;
 * 			pp = s - 1;
 * 			pivot = arr[e];
 * 			
 * 			while cp < e:
 * 				if (arr[cp] < pivot):
 * 					++pp;
 * 					t = arr[cp];
 * 					arr[cp] = arr[pp];
 * 					arr[pp] = t;
 * 			++pp;
 * 			t = arr[e];
 * 			arr[e] = arr[pp];
 * 			arr[pp] = t;
 * 		
 * 			return pp;			
 * </pre>
 * */

public class QuickSort extends Sort {
	int c=0;
	@Override
	public Sort sort() {
		int n = this.arr.length;
		System.out.println("\n Input:: "+Arrays.toString(arr));
		quickSort(this.arr, 0, n-1);
		return this;
	}
	
	public void quickSort(int[] arr, int start, int end) {
		System.out.println("\n");
		if(start >= end) {
			return;
		}
		System.out.println(this.getClass().getSimpleName()+" :: "+(++c)+"; start:="+start+"; end:="+end+" => "+Arrays.toString(Arrays.copyOfRange(this.arr, start, end)));
		int p = partition(start,end);
		quickSort(this.arr, start, p-1);
		quickSort(this.arr, p+1, end);
	}
	
	public int partition(int start, int end) {
		int current_pointer		= start;
		int partition_pointer   = start - 1;
		if(null != this.arr) {
			if(end > 0 && this.arr.length > end) {
				int pivot = this.arr[end];
				while(current_pointer <= end) {
					System.out.println(" ======= ");
					
					if (arr[current_pointer] < pivot) {
						++partition_pointer;
						if(arr.length > partition_pointer) {
							if(partition_pointer == current_pointer) {
								System.out.println("1A");
								System.out.println("    => partition:: pp   = ("+partition_pointer+","+(this.arr.length>partition_pointer && partition_pointer>=0?this.arr[partition_pointer]:"null ")+")");
								System.out.println("    => partition:: curr = ("+current_pointer+","+(this.arr.length>current_pointer && current_pointer>=0?this.arr[current_pointer]:"null ")+")");
							}else {
								System.out.println("1B");
								System.out.println("    => partition:: pp   = ("+partition_pointer+","+(this.arr.length>partition_pointer && partition_pointer>=0?this.arr[partition_pointer]:"null ")+")");
								System.out.println("    => partition:: curr = ("+current_pointer+","+(this.arr.length>current_pointer && current_pointer>=0?this.arr[current_pointer]:"null ")+")");
								int temp = arr[current_pointer];
								arr[current_pointer] = arr[partition_pointer];
								arr[partition_pointer] = temp;
							}
						}
					} else {
						System.out.println("1C");
						System.out.println("    => partition:: pp   = ("+partition_pointer+","+(this.arr.length>partition_pointer && partition_pointer>=0?this.arr[partition_pointer]:"null ")+")");
						System.out.println("    => partition:: curr = ("+current_pointer+","+(this.arr.length>current_pointer && current_pointer>=0?this.arr[current_pointer]:"null ")+")");
					}
					++current_pointer;
					
					System.out.println("    => partition:: arr  = "+Arrays.toString(Arrays.copyOfRange(this.arr, start, end)));
				}
				++partition_pointer;
				if(this.arr.length > partition_pointer) {
					System.out.println("2A");
					int temp = this.arr[partition_pointer];
					this.arr[partition_pointer] = this.arr[end];
					this.arr[end] = temp;
				}
			}
		}
		System.out.println("    ===> partition:: arr  = "+Arrays.toString(Arrays.copyOfRange(this.arr, start, end)));
		System.out.println("    ===> partition:: pp   = ("+partition_pointer+","+(this.arr.length>partition_pointer && partition_pointer>=0?this.arr[partition_pointer]:"null ")+")");
		System.out.println("    ===> partition:: curr = ("+current_pointer+","+(this.arr.length>current_pointer && current_pointer>=0?this.arr[current_pointer]:"null ")+")");
		return partition_pointer;
	}
}
