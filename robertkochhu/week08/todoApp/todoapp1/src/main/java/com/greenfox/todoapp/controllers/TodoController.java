package com.greenfox.todoapp.controllers;

import com.greenfox.todoapp.models.Todo;
import com.greenfox.todoapp.repository.TodoRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TodoController {
    TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping(value = {"/todo", "/todo/list", "/todolist"})
    public String list(Model model, @RequestParam(required = false) Boolean isActive) {
        if (isActive == null) {
            model.addAttribute("todos", todoRepository.findAll());
        } else if (isActive) {
            List<Todo> isNotDone = Streamable.of(todoRepository.findAll()).stream()
                    .filter(a -> !a.isDone())
                    .collect(Collectors.toList());
            model.addAttribute("todos", isNotDone);
        } else if (!isActive) {
            List<Todo> isNotDone = Streamable.of(todoRepository.findAll()).stream()
                    .filter(a -> a.isDone())
                    .collect(Collectors.toList());
            model.addAttribute("todos", isNotDone);
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String add(Model model) {
        return ("add");
    }

}
