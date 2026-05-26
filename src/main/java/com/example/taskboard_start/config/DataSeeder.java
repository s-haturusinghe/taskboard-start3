package com.example.taskboard_start.config;


import com.example.taskboard_start.task.Task;
import com.example.taskboard_start.task.TaskRepository;
import com.example.taskboard_start.task.TaskStatus;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner seedDatabase(TaskRepository taskRepository) {
        return args -> {
            if (taskRepository.count() == 0) {
                taskRepository.save(new Task(
                        "Prepare Thymeleaf lecture",
                        TaskStatus.IN_PROGRESS,
                        LocalDate.now().plusDays(1)
                ));

                taskRepository.save(new Task(
                        "Review PRG pattern",
                        TaskStatus.TODO,
                        LocalDate.now().plusDays(3)
                ));

                taskRepository.save(new Task(
                        "Publish lesson slides",
                        TaskStatus.DONE,
                        LocalDate.now().minusDays(1)
                ));
            }
        };
    }
}