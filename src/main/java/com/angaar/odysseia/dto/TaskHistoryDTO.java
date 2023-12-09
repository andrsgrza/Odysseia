package com.angaar.odysseia.dto;

import java.time.LocalDateTime;

public class TaskHistoryDTO {
	private Long id;
	private String title;
	private TaskDTO task;
	private String actionType;
	private String newValue;
	private Long modifiedBy;
	private LocalDateTime modifiedAt;	
	
	public TaskHistoryDTO() {
		super();
	}


	public TaskHistoryDTO(Long id, String title, TaskDTO task, String actionType, String newValue, Long modifiedBy,
			LocalDateTime modifiedAt) {
		super();
		this.id = id;
		this.title = title;
		this.task = task;
		this.actionType = actionType;
		this.newValue = newValue;
		this.modifiedBy = modifiedBy;
		this.modifiedAt = modifiedAt;
	}


	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public TaskDTO getTask() {
		return task;
	}


	public String getActionType() {
		return actionType;
	}


	public String getNewValue() {
		return newValue;
	}


	public Long getModifiedBy() {
		return modifiedBy;
	}


	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}
	
	
	

}
