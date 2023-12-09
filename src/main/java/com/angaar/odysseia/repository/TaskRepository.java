package com.angaar.odysseia.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.angaar.odysseia.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
	List<Task> findByStatus(String status);
	List<Task> findByPrority(String priority);
	List<Task> findByUser_UserName(String username);
	List<Task> findByDueDateBefore(LocalDate dueDate);
	@Query("SELECT t FROM Task t WHERE LOWER(t.title) LIKE LOWER(CONCAT('%', :title, '%'))")
	List<Task> findByTitleContains(@Param("title") String title);
	@Query("SELECT t FROM Task t WHERE t.status = 'Completed'")
	List<Task> findCompletedTasks();
	@Query("SELECT t FROM Task t WHERE t.dueDate < CURRENT_DATE AND t.status <> 'Completed'")
	List<Task> findOverdueTasks();
}
