package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="test")
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String taskName;
	private String description;
	private String date;
	private String note;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(int id, String taskName, String description, String date, String note) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.description = description;
		this.date = date;
		this.note = note;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", taskName=" + taskName + ", description=" + description + ", date=" + date
				+ ", note=" + note + "]";
	}
	
	
	

}
