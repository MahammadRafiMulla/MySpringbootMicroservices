package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstappApplication.class, args);
	
	List l= new ArrayList();
	
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	System.out.println(l);
	}

}
