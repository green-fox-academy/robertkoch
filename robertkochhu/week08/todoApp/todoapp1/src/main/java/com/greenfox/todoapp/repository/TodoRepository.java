package com.greenfox.todoapp.repository;

import com.greenfox.todoapp.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
