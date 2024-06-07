package com.userdatajpaapllication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.userdatajpaapllication.entity.User;
import com.userdatajpaapllication.service.UserService;

@SpringBootApplication
public class UserDataJpaApplication implements CommandLineRunner
{

	@Autowired
	private UserService userService;
	public static void main(String[] args) 
	{
		SpringApplication.run(UserDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		User user1 = new User();
        user1.setName("shraddha ");
        user1.setEmail("shraddha5533@gmail.com");
        userService.createUser(user1);

        User user2 = new User();
        user2.setName("patil");
        user2.setEmail("patil@example.com");
        userService.createUser(user2);
		
	}

}
