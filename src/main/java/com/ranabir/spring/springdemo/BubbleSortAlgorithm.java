package com.ranabir.spring.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  //add Primary tag for the priority component.
public class BubbleSortAlgorithm implements SortAlgorithm{
	
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
