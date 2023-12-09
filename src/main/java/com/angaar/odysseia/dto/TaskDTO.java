package com.angaar.odysseia.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class TaskDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String title;
    private String description;
    private String status;
    private String priority;
    private LocalDate dueDate;
    private UserDTO user;
     
	public TaskDTO() {
		super();
	}

	public TaskDTO(Integer id, String title, String description, String status, String priority, LocalDate dueDate, UserDTO user) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.priority = priority;
		this.dueDate = dueDate;
		this.user = user;
	}
	
	public Integer getId() {
		return this.id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getStatus() {
		return status;
	}

	public String getPriority() {
		return priority;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public UserDTO getUser() {
		return user;
	}
    
}
