package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Test;

public interface TestService {
	
	List<Test> getAllTestTodo();
	void saveTest(Test test);
	Test getTestById(Integer id);
	void deleteTest(Integer id);

}
