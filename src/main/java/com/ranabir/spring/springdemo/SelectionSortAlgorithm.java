package com.ranabir.spring.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SelectionSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] arr) {
		int min=0;
        int temp=0;
        for(int i=0; i<arr.length; i++){ //time complexity for the loop - n 
            min=i;
            for (int j=i+1; j<arr.length; j++){ //time complexity for the loop - n , total time complexity is O(n^2)
                if( arr[j]<arr[min]){
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
	}
}
