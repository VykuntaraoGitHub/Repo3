package com.hcl.a.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.hcl")
public class Springboot_HibernateMainClass {

	public static void main(String[] args) {
		
		SpringApplication.run(Springboot_HibernateMainClass.class, args);  
		System.out.println(" Welcome to spring boot---1 ");

	}

}
