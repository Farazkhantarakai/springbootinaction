package com.springboot.action.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Todo {
    public int id;
    public String userName;
    public String description;
    public LocalDate localDate;
    public Boolean done;
}
