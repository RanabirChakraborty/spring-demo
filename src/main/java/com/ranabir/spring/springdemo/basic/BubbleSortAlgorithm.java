package com.ranabir.spring.springdemo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
// @Primary  //1. way to handle multiple dependencies - add Primary tag for the priority component.
@Qualifier("bubble") // 2. way to handle multiple dependencies
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				// ascending sorting
				if (arr[j] > arr[j + i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}

}
