package com.gantz.spring.spingangular;

import com.gantz.spring.spingangular.entity.Task;
import com.gantz.spring.spingangular.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class SpingAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingAngularApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(TaskService taskService) {
		return args -> {
			taskService.save(new Task(0, "Task1", LocalDate.now(), true));
			taskService.save(new Task(0, "Task2", LocalDate.now(), false));
		};
	}
}

