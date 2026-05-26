package com.example.taskboard_start.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Derived query: SELECT * FROM task WHERE status = ?
    List<Task> findByStatus(TaskStatus status);
}
