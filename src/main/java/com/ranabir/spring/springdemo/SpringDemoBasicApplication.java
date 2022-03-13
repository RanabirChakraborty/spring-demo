package com.ranabir.spring.springdemo;

import com.ranabir.spring.springdemo.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoBasicApplication {

	public static void main(String[] args) {
		
		int[] arr = {3,2,5,7,1,9};
		int target = 9;
		// here only you have to mention what type of sorting algo you want, and this is how it becomes loosely coupled.
		// BinarySearchImpl obj = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		// For Spring we don't also need the loosely coupled object, Spring will automatically manage the dependencies and put it inside an ApplicationConext bean.
		ApplicationContext applicationContext = SpringApplication.run(SpringDemoBasicApplication.class, args);
		
		// from the applicationContext we'll get a bean of the @Component mentioned class
		BinarySearchImpl obj1 = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl obj2 = applicationContext.getBean(BinarySearchImpl.class);

		// if we don't use @Scope("prototype") at BinarySearchImpl then for both obj1 and obj2 the instance will be same.
		System.out.println(obj1);
		System.out.println(obj2);
		
		//because we need the output to print, we'll put the bean inside an object.
		System.out.print("The target is at index - "+ obj1.binarySearch(arr, target)+ "  ");
	}

}
