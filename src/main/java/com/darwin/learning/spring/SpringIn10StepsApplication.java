package com.darwin.learning.spring;

import com.darwin.learning.spring.components.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// All the packages and sub packages of the class containing this annotation are scanned by component scanner automatically
// to find all Beans.
// Bean - It is an object whose lifecycle is managed by Spring and is available in Application Context.

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) throws InterruptedException {
		// below statement would start the spring application.
		// Are the beans loaded after the execution of below statement or before the execution of below statement?
		// Answer - After the execution of below statement
		ApplicationContext context = SpringApplication.run(SpringIn10StepsApplication.class, args);
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch.getClass());
	}

}
