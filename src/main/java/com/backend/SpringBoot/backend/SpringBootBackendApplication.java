package com.backend.SpringBoot.backend;

import com.backend.SpringBoot.backend.model.User;
import com.backend.SpringBoot.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Rishi", "Raj", "dps.raj2011@gmail.com"));
		this.userRepository.save(new User("Tom", "Cruise", "tom.cruise@gmail.com"));
		this.userRepository.save(new User("Tony", "Stark", "tony.stark@gmail.com"));
	}
}
