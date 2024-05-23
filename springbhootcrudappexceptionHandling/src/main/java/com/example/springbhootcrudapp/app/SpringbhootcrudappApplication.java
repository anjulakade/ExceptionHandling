package com.example.springbhootcrudapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springbhootcrudapp.app.model.Product;

@SpringBootApplication
public class SpringbhootcrudappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbhootcrudappApplication.class, args);
		Product p =new Product ();

//	Product p =new Product (1,"samsung","mobile",1200.0);
//	System.out.println(p);
	}

}
