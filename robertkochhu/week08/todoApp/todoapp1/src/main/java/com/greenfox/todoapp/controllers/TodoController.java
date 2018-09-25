package com.greenfox.todoapp.controllers;

import com.greenfox.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
    TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping(value={"/todo","/todo/list","/todolist"})
    public String list(Model model, @RequestParam(value = "isActive",required=false)){
        model.addAttribute("todos",todoRepository.findAll());
        return "todolist";
    }
}
