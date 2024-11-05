package com.example.ToDoApp;

import com.example.ToDoApp.service.ToDoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.ToDoApp.controller")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		}
	@Bean
	public ToDoService ToDoService(){
		return new ToDoService();
	}

}
