package com.arms.app.project;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProjectForm {
	private int id;
	private String name;

	public ProjectForm() {
	}
}