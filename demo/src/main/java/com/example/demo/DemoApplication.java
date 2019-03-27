package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;




@EnableJpaAuditing
@SpringBootApplication
@ComponentScan(basePackageClasses = bookcontroller.class)
public class DemoApplication{
	@Autowired
	bookdaoimpl ba;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}

	/*
	 * @Override public void run(String... args) throws Exception { ba.save(new
	 * Book(1,236));
	 * 
	 * }
	 */

	

	//@Override
	//public void run(String... args) throws Exception {
     // bi.addbooks(new Book(1,125));		
	//}
	
	

}
