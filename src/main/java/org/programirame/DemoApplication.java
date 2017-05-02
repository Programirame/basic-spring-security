package org.programirame;

import org.programirame.models.AppUser;
import org.programirame.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void addUsers() {
		userRepository.save(new AppUser("userOne", "programirame"));
		userRepository.save(new AppUser("userTwo", "programirame"));
	}
}
