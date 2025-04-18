package com.scrum.Scrumboard.controller;

import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//   <domain>/employee/{name}/department/{name}


@RestController
public class Test {

    @GetMapping("employee")
    public Employee getEmployee(){

        return new Employee();
    }

    @PostMapping("employee/{employee}")
    public Employee getEmployee(@RequestParam(required = false) Employee employee){
        return employee;
    }

}
class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    String gender;

}

