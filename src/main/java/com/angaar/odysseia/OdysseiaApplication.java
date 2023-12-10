package com.angaar.odysseia;


import java.time.LocalDate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.angaar.odysseia.entity.Task;
import com.angaar.odysseia.service.TaskService;

@SpringBootApplication
@EntityScan("com.*")
@ComponentScan(basePackages = {"com.*"})
@EnableJpaRepositories(basePackages = "com.*")
public class OdysseiaApplication implements CommandLineRunner{

	private static Log LOGGER = LogFactory.getLog(OdysseiaApplication.class);
	
	@Autowired
	TaskService service;
	
	public static void main(String[] args) {
		SpringApplication.run(OdysseiaApplication.class, args);
	}
	@Override
	public void run(String...args) {
		Task task = new Task();
		task.setId(1L);
		task.setDescription("Test the logger");
		task.setDueDate(LocalDate.of(2023, 12, 10));
		task.setPriority("HIGH");
		task.setStatus("OPEN");
		task.setTitle("Logger Test");
		System.out.println(task);
		LOGGER.info("callign service to create task");
		service.createTask(task);
		
	}

}
