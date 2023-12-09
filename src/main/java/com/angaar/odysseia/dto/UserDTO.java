package com.angaar.odysseia.dto;

import java.util.List;

public class UserDTO {
	private Long id;
	private String username;
	private String password;
	private String email;
	private List<TaskDTO> tasks;	
	
	public UserDTO() {
		super();
	}

	public UserDTO(Long id, String username, String password, String email, List<TaskDTO> tasks) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.tasks = tasks;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public List<TaskDTO> getTasks() {
		return tasks;
	}
	
	

}
