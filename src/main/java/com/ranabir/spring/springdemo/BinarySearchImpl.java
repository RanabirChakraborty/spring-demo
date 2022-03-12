package com.ranabir.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	// 1st - you can use @Autowired without any setter or constructor.

	// 2nd - you can use @Autowired with setter.
	
	/*
	 * public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * this.sortAlgorithm = sortAlgorithm; }
	 */
	
	// 3rd - you can use @Autowired with Constructor.
	// (earlier if mandatory dependency then constructor injection is important way.)
	
	/*
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
	 * 	super();
	 * this.sortAlgorithm = sortAlgorithm; }
	 */

	public int binarySearch(int[] arr, int target) {

		// the array needs to be sorted.
		// use any sorting algo.
		// BubbleSortAlgorithm sort = new BubbleSortAlgorithm();
		int[] sortedArr = sortAlgorithm.sort(arr);
		
		// binary search algo
		
		int hi = 0;
		int li = sortedArr.length-1;
		
		while(hi <= li) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = hi + (li - hi) / 2;

            if (target < sortedArr[mid]) {
                li = mid - 1;
            } else if (target > sortedArr[mid]) {
                hi = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
	}
}
