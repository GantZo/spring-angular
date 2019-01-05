package com.gantz.spring.spingangular.repository;

import com.gantz.spring.spingangular.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {


}
