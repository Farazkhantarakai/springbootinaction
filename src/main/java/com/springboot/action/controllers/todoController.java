package com.springboot.action.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.action.models.Todo;
import com.springboot.action.services.TodoService;

@Controller
public class todoController {

    private TodoService todoService;

    todoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public String  getTodo(ModelMap map) {

       List<Todo> data= todoService.findByUserName("farazkhan");
        map.put("todo", data);
      return "todo";
    }

}
