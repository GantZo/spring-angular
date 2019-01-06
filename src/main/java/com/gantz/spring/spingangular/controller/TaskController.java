package com.gantz.spring.spingangular.controller;

import com.gantz.spring.spingangular.entity.Task;
import com.gantz.spring.spingangular.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Collection<Task> list() {
        return this.taskService.list();
    }

    @PostMapping(value = "/save")
    public Task save(@RequestBody Task task) {
        return this.taskService.save(task);
    }

}
