package com.gantz.spring.spingangular.service;

import com.gantz.spring.spingangular.entity.Task;

import java.util.Collection;

public interface TaskService {

    Collection<Task> list();
    Task save(Task task);
}
