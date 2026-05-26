package com.example.taskboard_start.task;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model) {

        // TODO:
        // 1. Retrieve all tasks from the service
        // 2. Add them to the model
        // 3. Return the Thymeleaf view name

        return "";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {

        // TODO:
        // 1. Create an empty TaskForm object
        // 2. Add it to the model
        // 3. Return the form view name

        return "";
    }

    @PostMapping
    public String createTask(
            @Valid @ModelAttribute("taskForm") TaskForm taskForm,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes,
            Model model
    ) {

        // TODO:
        // 1. Check for validation errors
        // 2. Convert TaskForm to Task entity
        // 3. Save using the service
        // 4. Add flash message
        // 5. Redirect to /tasks

        return "";
    }
}