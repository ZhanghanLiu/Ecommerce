package com.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookstore.security.User;

@SpringBootApplication
public class BookstoreAngularApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreAngularApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
			User user1 = new User();
			user1.setFirstName("John");
			user1.setLastName("Adam");
			user1.setUsername("j");
			user1.setPassword(SecurityUtility.passswordEncoder().encode("p"));
			user1.setEmail("JAdams@gmail.com");
			
	}
}
