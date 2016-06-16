package com.gabrielfeitosa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gabrielfeitosa.entity.Task;

@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Long> {

}
