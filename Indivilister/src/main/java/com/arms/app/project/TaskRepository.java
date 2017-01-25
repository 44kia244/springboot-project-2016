package com.arms.app.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.arms.domain.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
	@Transactional
	void deleteByProjectId(int projectId);
}
