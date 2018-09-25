package com.greenfox.todoapp;

import com.greenfox.todoapp.models.Todo;
import com.greenfox.todoapp.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappApplication implements CommandLineRunner {
    TodoRepository todoRepository;

    public TodoappApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(TodoappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Todo todo= new Todo();
        todo.setTitle("lets see");
        Todo todo1=new Todo();
        todo1.setTitle("taks1");
        Todo todo2=new Todo();
        todo2.setTitle("Jump");
        todo2.setDone(true);
        todoRepository.save(todo2);
        todoRepository.save(todo);
        todoRepository.save(todo1);
        System.out.println(todoRepository.findAll());
    }
}
