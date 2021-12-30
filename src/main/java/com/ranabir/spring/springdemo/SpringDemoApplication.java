package com.ranabir.spring.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		
		int[] arr = {3,2,5,7,1,9};
		int target = 9;
		// here only you have to mention what type of sorting algo you want, and this is how it becomes loosely coupled.
		// BinarySearchImpl obj = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		// For Spring we don't also need the loosely coupled object, Spring will automatically manage the dependencies and put it inside an ApplicationConext bean.
		ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
		
		// from the applicationContext we'll get a bean of the @Component mentioned class
		BinarySearchImpl obj = applicationContext.getBean(BinarySearchImpl.class);
		
		//because we need the output to print, we'll put the bean inside an object.
		System.out.print("The target is at index - "+ obj.binarySearch(arr, target)+ "  ");
	}

}
