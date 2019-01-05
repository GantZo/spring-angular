package com.gantz.spring.spingangular.controller;

import com.gantz.spring.spingangular.entity.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/tasks/")
public class TaskController {

    @GetMapping(value = {"", "/"})
    public Collection<Task> list() {
        return null;
    }

}
