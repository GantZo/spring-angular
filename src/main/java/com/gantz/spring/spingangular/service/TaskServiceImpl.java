package com.gantz.spring.spingangular.service;

import com.gantz.spring.spingangular.entity.Task;
import com.gantz.spring.spingangular.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Collection<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}
