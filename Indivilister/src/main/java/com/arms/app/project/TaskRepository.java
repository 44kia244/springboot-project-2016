package com.arms.app.project;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arms.domain.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
	
}
