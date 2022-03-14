package com.ranabir.spring.springdemo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
// @Scope("prototype")
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  // similar of @Scope("prototype")
public class BinarySearchImpl {

	@Autowired
	@Qualifier("bubble")
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

	Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);

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

	// @PostConstruct runs only once, just after the initialization of bean properties.
	@PostConstruct
	public void postConstruct(){
		LOGGER.info("Here is postConstruct.");
	}

	// @PreDestroy runs only once, just before Spring removes our bean from the application context.
	@PreDestroy
	public void preDestroy(){
		LOGGER.info("Here is preDestroy");
	}
}
