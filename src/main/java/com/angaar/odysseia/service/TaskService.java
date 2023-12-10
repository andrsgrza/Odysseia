package com.angaar.odysseia.service;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angaar.odysseia.OdysseiaApplication;
import com.angaar.odysseia.entity.Task;
import com.angaar.odysseia.repository.TaskRepository;

@Service
public class TaskService {
	private static final Log Logger = LogFactory.getLog(TaskService.class);
	private TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Task createTask(Task task) {
    	System.out.println("asdfasd");
    	Logger.info("Creating task " + task.getId() + " with values " + task);
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task updatedTask) {
    	
        Optional<Task> existingTaskOptional = taskRepository.findById(id);

        if (existingTaskOptional.isPresent()) {
            Task existingTask = existingTaskOptional.get();
            existingTask.setTitle(updatedTask.getTitle());
            existingTask.setDescription(updatedTask.getDescription());
            // Update other attributes as needed
            return taskRepository.save(existingTask);
        } else {
            // Handle task not found
            return null;
        }
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
