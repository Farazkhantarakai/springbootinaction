package com.springboot.action.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.action.models.Todo;

@Service
public class TodoService {

    private static List<Todo> todos=new ArrayList<>();

    static {
        todos.add(new Todo(0, "farazkhan", "this is my first", LocalDate.ofYearDay(24, 23), false));
        todos.add(new Todo(1, "umar khan", "this is my first", LocalDate.ofYearDay(24, 23), false));
        todos.add(new Todo(2, "faisalkhan", "this is my first", LocalDate.ofYearDay(24, 23), false));
        todos.add(new Todo(3, "adnan khan", "this is my first", LocalDate.ofYearDay(24, 23), false));
    }

    public List<Todo> findByUserName(String userName) {
        return todos;
    }

}
