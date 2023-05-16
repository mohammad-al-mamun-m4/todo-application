package com.example.demo.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Test;
import com.example.demo.repository.TestRepository;
import com.example.demo.service.TestService;

@Service
public class TestServiceImp implements TestService {
	
	@Autowired
	private TestRepository testRepo;

	@Override
	public List<Test> getAllTestTodo() {
		
		return testRepo.findAll();
	}

	@Override
	public void saveTest(Test test) {
		this.testRepo.save(test);
		
	}

	@Override
	public Test getTestById(Integer id) {
		Optional<Test>optional = testRepo.findById(id);
		Test test = null;
		if(optional.isPresent()) {
			test = optional.get();
		}else{
			throw new RuntimeException("Test todo Id is not found::"+ id);
		}
		
		return test;
	}

	@Override
	public void deleteTest(Integer id) {
		this.testRepo.deleteById(id);
		
	}

}
