package com.gabrielfeitosa.repository;

import javax.persistence.RollbackException;
import javax.validation.ConstraintViolationException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.TransactionSystemException;

import com.gabrielfeitosa.Application;
import com.gabrielfeitosa.entity.Task;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest({ "server.port=0" })
public class TaskRepositoryTest {

	@Autowired
	TaskRepository taskRepository;
	
	@Before
	public void clean(){
		taskRepository.deleteAll();
	}
	//hola
}
